import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
        
        Queue<String> cache = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            //캐시 계산: 캐시에 있을 경우
            if(cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                result += 1;
            }
            //캐시 계산: 캐시에 없을 경우
            else{
                if(cache.size() >= cacheSize) cache.remove();
                cache.add(city);
                result += 5;
            }

        }

        return result;
    }
}