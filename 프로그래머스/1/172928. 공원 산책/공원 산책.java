class Solution {
    public int[] solution(String[] park, String[] routes) {
        int sx = 0, sy = 0;
        String[][] arr = new String[park.length][park[0].length()];

        //시작 좌표 잡기
        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].split("");
            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }

        //이동
        for (String route : routes) {
            String direction = route.split(" ")[0];
            Integer distance = Integer.parseInt(route.split(" ")[1]);

            int tempX = sx, tempY = sy;
            for (int i = 0; i < distance; i++) {

                if(direction.equals("E")) tempX++;
                else if(direction.equals("W")) tempX--;
                else if(direction.equals("N")) tempY--;
                else if (direction.equals("S")) tempY++;

                if(tempX < park[0].length() && tempX >= 0 && tempY < park.length && tempY >= 0) {
                    if(arr[tempY][tempX].equals("X")) break;
                    if(i == distance - 1){
                        sx = tempX;
                        sy = tempY;
                    }
                }
            }

        }

        return new int[]{sy, sx};
    }
}