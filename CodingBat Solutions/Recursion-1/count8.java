 int count8(int n) {
 	if(n%10==n){
 	if(n%10==8) {
 return 1;
}
return 0;
 	}
 	if(n%10!=8) {
 return count8(n/10);
}
 	else if(n%100==88) {
 	return count8(n/10)+2;
 	}
return count8(n/10)+1;
}
