function solution(ineq, eq, n, m) {
    let a = ineq + eq;
    var answer = 0;
    switch(a){
        case '>=':
            if(n >= m) answer = 1;
        break;
        case '<=':
            if(n <= m) answer = 1;
        break;
        case '>!':
            if(n > m) answer = 1;
        break;
        case '<!':
            if(n < m) answer = 1;
        break;
    }
    return answer;
}