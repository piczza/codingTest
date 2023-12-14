class Solution {
    boolean orOperator(boolean a, boolean b){
        return a || b;
    }
    
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return orOperator(x1, x2) && orOperator(x3, x4);

    }
}