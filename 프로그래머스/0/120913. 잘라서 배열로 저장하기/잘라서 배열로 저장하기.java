class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int cnt = 0;
        String temp_str = "";
        String[] str_arr = new String[(int)Math.ceil((double)my_str.length()/n)];
        
        for (int i=0; i<my_str.length(); i++){
            temp_str = temp_str.concat(String.valueOf(my_str.charAt(i)));
            cnt++;
            if (cnt == n || i == my_str.length() - 1) {
                str_arr[i / n] = temp_str; 
                temp_str = "";
                cnt = 0;
            }
        }
        return str_arr;
    }
}