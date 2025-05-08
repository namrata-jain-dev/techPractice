import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class sortString {

    static String  sortStr (String s){
        HashMap<Character,Integer> map = new HashMap<>();
        String result = "";

        for(int i = 0 ; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        System.out.println("map is "+map);
        return  "";
    }
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println(sortStr("madam"));

    }
}
