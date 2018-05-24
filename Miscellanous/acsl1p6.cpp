// warning, must use c++ 11 when complier for it to work, and use c++11 when submiting to the judge
#include<iostream>
#include<vector>
#include<cmath>
#include<map>
#include<algorithm>
#include<sstream>
#include<cctype>
#include<stack>
#define len(x) (int)(x).size()


std::vector<std::string> unary_ops={"+", "-", "sin", "cos", "tan", "log", "sqrt"};
std::map<std::string, std::string> math_const = {{"pi", "3.1415"}, {"e", "2.7182"}}; 

/** Determines the precidence of each operator.
 *
 *  Assigns a presedence to an op depending on BEDMAS rules and gives
 *  more presedence to unary type variables.
 * */
int prec(std::string op, bool unary){
    if(unary){
        // check if this is one of the predefined unary operators
        if(std::find(unary_ops.begin(), unary_ops.end(), op) != unary_ops.end()){ 
            return 3;
        }
        return 0;
    }
    if(op == "^") return 4;
    if(op == "*" || op == "/") return 2;
    if(op == "+" || op == "-") return 1;
    return 0; // not a binary operator
}

/** Performs unary option.
 * */
int calc_unary_op(std::string op, int val){
    if(op == "+") return +val;
    if(op == "-") return -val;
    throw std::runtime_error("Invalid unary operator: " + op);
    /*
    if(op == 'sin')
        return math.sin(val)
    if(op == 'cos')
        return math.cos(val)
    if(op == 'tan')
        return math.tan(val)
    if op == 'log':
        return math.log(val)
    if op == 'sqrt':
        return math.sqrt(val)
    */
}

/** Performs arithmetic on operands 
 * */
int calc_operands(std::string op, int left_operand, int right_operand){
    if(op == "+")
        return left_operand + right_operand;
    if(op == "-")
        return left_operand - right_operand;
    if(op == "*")
        return left_operand * right_operand;
    if(op == "/")
        return left_operand / right_operand;
    if(op == "^")
        return (int)pow(left_operand, right_operand);
    throw std::runtime_error("Invalid binary operator: " + op);
}

/** Checks if it's an operand defined in our prec function
 * */
bool is_operand(std::string str){
    return str != "(" && str != ")" && !prec(str, false) && !prec(str, true);
}

/** Converts string to 32 bit int
 * */
int string_to_int(std::string s){
    int ret;
    std::stringstream ss;
    ss << s;
    ss >> ret;
    return ret;
}

/** 32 bit int to a string 
 * */
std::string int_to_string(int i){
    std::string ret;
    std::stringstream ss;
    ss << i;
    ss >> ret;
    return ret;
}

/** Evaluates a list in postfix(Reverse Polish) expression.
 * */
int evaluate_expr(std::vector<std::string>expr){
    //E = ['('] + E + [')']
    expr.insert(expr.begin(), "(");
    expr.push_back(")");

    std::stack< std::pair<std::string, bool> >ops;
    std::stack<int>vals;

    for(int i = 0;i < len(expr);i++){
        if(is_operand(expr[i])){
            vals.push(string_to_int(expr[i]));
            continue;
        }
        else if(expr[i] == "("){
            ops.push(std::make_pair("(", false));
            continue;
        }
        // This is a valid unary operator 
        else if(prec(expr[i], true) && (i == 0 || expr[i-1] == "(" || prec(expr[i-1], false) )){
            ops.push(std::make_pair(expr[i], true));
            continue;
        }
        while(prec(ops.top().first, ops.top().second) >= prec(expr[i], false)){
            std::string op = ops.top().first;
            bool is_unary = ops.top().second;
            ops.pop();
            if(op == "(") break;
            int y = vals.top(); vals.pop();
            if(is_unary){
                vals.push(calc_unary_op(op, y));
            }
            else{
                int x = vals.top(); vals.pop();
                vals.push(calc_operands(op, x, y));
            }
        }
        if(expr[i] != ")"){
            ops.push(std::make_pair(expr[i], false));
        }
    }
    return vals.top();
}

/** Split a string expression to tokens.
 *
 *  Split a string expression to tokens, ignoring whitespace delimiters.
 *  A vector of tokens is a more flexible format since you can decide to
 *  parse the expression however you wish just by modifying this function.
 *
 *  >>> split_expr("1+(51*-100)")
 *  ["1","+","(","51","*","-","100",")"]
 * */
std::vector<std::string> split_expr(std::string s, std::string delim=" \n\t\v\f\r"){
    std::vector<std::string>ret;
    std::string acc;
    int i = 0;
    while(i < len(s)){
        // supports decimals and integers 
        if(isdigit(s[i]) || s[i] == '.')
            acc += s[i];
        else{
            if((i > 0 && isdigit(s[i-1])) || s[i-1] == '.'){
                ret.push_back(acc);
                acc = "";
            }
            // skip special chars
            if(delim.find(s[i]) != std::string::npos){
                i+=1;
                continue;
            }
            // Here we will try to parse for sin,cos,tan,log and math constants
            // like pi,e. For two letter or one letter constants we don't worry
            // need to worry about skipping a bracket.
            if(isalpha(s[i])){
                bool is_valid_alpha = true;
                for(int j = 1;j <= 4;j++){
                    if(i+j <= len(s)){
                        is_valid_alpha &= isalpha(s[i+j]);
                        if(is_valid_alpha){
                            std::string cur_substr = s.substr(i, j);
                            if(std::find(unary_ops.begin(), unary_ops.end(), cur_substr) != unary_ops.end()){  
                                ret.push_back(cur_substr);
                                i+= j;
                            }
                            else if(math_const.count(cur_substr)){
                                ret.push_back(math_const[cur_substr]);
                                i+= j;
                            }
                            else{
                                // return nothing, invalid expression
                                return std::vector<std::string>(); 
                            }
                        }
                    }
                }
            }
            else{
                ret.push_back(std::string(1, s[i]));
            }
        }
        i += 1;
    }
    if(isdigit(s[len(s)-1]) || s[len(s)-1] == '.'){
        ret.push_back(acc);
    }
    return ret;
}

/** Evaluates an expression in infix notation
 * */
int evaluate(std::string str){
    std::vector<std::string>parsed=split_expr(str);
    if(len(parsed) != 0)
        return evaluate_expr(parsed);
    else
        return -1; 
}

int main(){
    std::string input;
    std::getline(std::cin, input);
    std::cout << evaluate(input) << std::endl;
    return 0; 
}
