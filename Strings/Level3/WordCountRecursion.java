package Strings.Level3;

import java.util.*;
class WordCountRecursion {
    static int count(String s,int i,boolean inWord){
        if(i==s.length()) return inWord?1:0;
        if(s.charAt(i)==' ') return (inWord?1:0)+count(s,i+1,false);
        return count(s,i+1,true);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        System.out.println(count(s,0,false));
    }
}
