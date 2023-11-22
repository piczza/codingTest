function solution(my_string, k) {
    var answer = [];
    
    for(i=0; i<k; i++){
        answer.push(my_string);
    }
    
    return answer.join('');
}