function solution(num_list) {
    let oddNum = "";
    let evenNum = "";
    for(i = 0; i < num_list.length; i++){
        !(num_list[i]%2) ? evenNum+=num_list[i]+"" : oddNum+=num_list[i]+"";
    }
    return Number(oddNum) + Number(evenNum);
}