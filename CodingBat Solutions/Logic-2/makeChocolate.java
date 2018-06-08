public int makeChocolate(int small, int big, int goal) {
    int remainder = goal >= 5 * big ? goal - (5 * big) : goal % 5;
    
    return remainder <= small ? remainder : -1;
}
