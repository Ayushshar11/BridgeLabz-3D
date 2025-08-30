package Strings.Level3;

import java.util.*;
class CharFrequencyRecursion {
    static void count(String s,int i,Map<Character,Integer> map){
        if(i==s.length()) return;
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
        count(s,i+1,map);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        count(s,0,map);
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
