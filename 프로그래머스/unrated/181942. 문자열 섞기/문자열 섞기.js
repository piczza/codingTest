function solution(str1, str2) {
    let a = str1.split('');
    let b = str2.split('');
    var answer = [];
    for(i=0; i<a.length; i++){
        answer.push(...a[i]);
        answer.push(...b[i]);
    }
    return answer.join('');
}