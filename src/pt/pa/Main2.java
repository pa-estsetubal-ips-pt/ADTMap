package pt.pa;

import pt.pa.adts.Map;
import pt.pa.adts.MapList;

public class Main2 {
    public static void main(String[] args) {
        char[] s = "arvorebinaria".toCharArray();
        Map<Character, Integer> map = new MapList<>();
        for(int i=0; i<s.length; i++) {
            if(!map.containsKey(s[i])) {
                map.put(s[i], i);
            }  
        }

        for(char c : map.keys()) {
            System.out.println(c + " : " + map.get(c));
        }
    }
}
