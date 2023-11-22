function solution(a, b) {
    if(String(a)+String(b)>= 2*Number(a)*Number(b) ){
        return Number(String(a)+String(b));
    }
    else return 2*a*b;
}