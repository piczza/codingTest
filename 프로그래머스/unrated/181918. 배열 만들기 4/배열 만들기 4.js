function solution(arr) {
    let stk = [];
    let i = 0;
    while( i < arr.length ){
        if(stk.length < 1){
            stk.push(arr[i++]);
            continue;
        }
        
        if(stk[stk.length-1] < arr[i]){
            stk.push(arr[i++]);
        }
        else stk.pop();
        
    }
    
    return stk;
}