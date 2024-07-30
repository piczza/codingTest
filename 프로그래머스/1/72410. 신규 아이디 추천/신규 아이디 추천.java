class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        String stepTwo = "";
        char[] chaArr1 = new_id.toCharArray();
        for (int i = 0; i < chaArr1.length; i++) {
            char c = chaArr1[i];
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c =='-' || c == '_' || c == '.')  {
                stepTwo += c;
            }
        }
        new_id = stepTwo;

        if(new_id.contains("..")){
            String stepThree = "";
            char[] chaArr = new_id.toCharArray();
            for (int i = 0; i < chaArr.length; i++) {
                char c = chaArr[i];
                if(i != 0 && chaArr[i-1] == '.' && c == '.') continue;
                stepThree += c;
            }
            new_id = stepThree;
        }

        if(new_id.startsWith(".") || new_id.endsWith(".")){
            String stepFour = "";
            char[] chaArr = new_id.toCharArray();
            for (int i = 0; i < chaArr.length; i++) {
                char c = chaArr[i];
                if((i == 0 || i == chaArr.length-1) && c == '.') continue;
                stepFour += c;
            }
            new_id = stepFour;
        }

        if(new_id.isEmpty()) new_id  = "a";

        if(new_id.length() >= 16) {
            String stepSix = "";
            char[] chaArr = new_id.toCharArray();
            for (int i = 0; i < 15; i++) {
                if(i == 14 && chaArr[i] == '.') continue;
                stepSix += chaArr[i];
            }
            new_id = stepSix;
        }

        if (new_id.length() <= 2){
            while (new_id.length() <= 2) {
                new_id += new_id.split("")[new_id.length()-1];
            }
        }

        return new_id;
    }
}