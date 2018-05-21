public int powerN(int base, int n) {
    if ( n == 0 ) {
        return 1;
    }
    return ( base* powerN(base,n-1));
}
