package Strings.Level3;

import java.util.*;
class CharFrequencyMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
