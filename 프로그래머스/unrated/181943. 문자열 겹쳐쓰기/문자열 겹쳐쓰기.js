function solution(my_string, overwrite_string, s) {
    let a = my_string.split('');
    let b = overwrite_string.split('');
    a.splice(s, b.length, ...b);
    return a.join('');
    
}