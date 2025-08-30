package Strings.Level2;

import java.util.Scanner;
class TrimSpacesDemo {
    static int[] trimIndices(String s){
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        return new int[]{start,end+1};
    }
    static String substringCustom(String s,int start,int end){
        String res="";
        for(int i=start;i<end;i++) res+=s.charAt(i);
        return res;
    }
    static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] idx=trimIndices(s);
        String trimmed=substringCustom(s,idx[0],idx[1]);
        String builtin=s.trim();
        System.out.println("Custom Trim: "+trimmed);
        System.out.println("Built-in Trim: "+builtin);
        System.out.println("Equal: "+compare(trimmed,builtin));
    }
}
