function solution(a, b) {
    // if(a === b){
    //     return console.log(`${a} ⊕ ${b}`);
    // }
    
    let sA = String(a) + String(b);
    let sB = String(b) + String(a);
    return sA > sB ? Number(sA) : Number(sB);
    
}