package Strings.Level1;

import java.util.Scanner;
class SubstringCompare {
    static String substringCharAt(String s,int start,int end){
        String sub="";
        for(int i=start;i<end;i++) sub+=s.charAt(i);
        return sub;
    }
    static boolean compareCharAt(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=sc.nextInt(),end=sc.nextInt();
        String sub1=substringCharAt(s,start,end);
        String sub2=s.substring(start,end);
        System.out.println("User-defined substring: "+sub1);
        System.out.println("Built-in substring: "+sub2);
        System.out.println("Comparison: "+compareCharAt(sub1,sub2));
    }
}
