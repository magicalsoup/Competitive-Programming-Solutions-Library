#include <iostream>
#include <cmath>
using namespace std;
double factorialdigits(int n) {
    double result = 1;
    for (int i = 1; i <= n; i++) {
        result += (log10(i));
    }
    return result;
}



int main() {
    int input;
    int cnt = 5;
    while (cnt--) {
    cin >> input;
    cout <<"The length of "<<input<<"! is "<<(int)factorialdigits((input)) << endl;
    }
}
