function solution(n) {
    var answer = 0;
    if(n%2 === 0){
        for(let i = 0; i < n; i++){
            if((n-i) % 2 === 0) answer += Math.pow((n-i), 2);
        }
    }
    else{
        for(let i = 0; i < n; i++){
            if((n-i) % 2 !== 0) answer += (n-i);
        }
    }
    return answer;
}