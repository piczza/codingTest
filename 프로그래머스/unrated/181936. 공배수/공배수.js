function solution(number, n, m) {
    N = number % n;
    M = number % m;
    return (0 === N) && (0 === M) ? 1 : 0;
}