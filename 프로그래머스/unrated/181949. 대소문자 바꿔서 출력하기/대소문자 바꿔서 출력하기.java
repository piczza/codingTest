import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        
        
        //for 문
        // for(int i = 0; i<b.length; i++){
                //삼항연산자
        //      b[i] = (Character.isUpperCase(b[i]))
        //         ? Character.toLowerCase(b[i])
        //         : Character.toUpperCase(b[i]);
                //이프문
        //      if(Character.isUpperCase(b[i])) b[i] = Character.toLowerCase(b[i]);
        //      else b[i] = Character.toUpperCase(b[i]);
        // }
        
        //for each 문
        String cList = "";
        for(char c : b){
            //삼항연산자
            cList += Character.isUpperCase(c)
                    ? Character.toLowerCase(c)
                    : Character.toUpperCase(c);
            //이프문
            // if(Character.isUpperCase(c)) cList += Character.toLowerCase(c);
            // else cList += Character.toUpperCase(c);
        }
        System.out.println(cList);
    }
}
