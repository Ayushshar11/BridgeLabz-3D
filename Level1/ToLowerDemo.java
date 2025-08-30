package Strings.Level1;

import java.util.Scanner;
class ToLowerDemo {
    static String toLowerCustom(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z') c=(char)(c+32);
            res+=c;
        }
        return res;
    }
    static boolean compareCharAt(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=toLowerCustom(s);
        String s2=s.toLowerCase();
        System.out.println("Comparison: "+compareCharAt(s1,s2));
    }
}
