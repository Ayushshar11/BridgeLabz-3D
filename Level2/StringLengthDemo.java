package Strings.Level2;

import java.util.Scanner;
class StringLengthDemo {
    static int customLength(String s){
        int count=0;
        try{
            for(;;){
                s.charAt(count);
                count++;
            }
        }catch(Exception e){}
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len1=customLength(s);
        int len2=s.length();
        System.out.println("Custom length: "+len1);
        System.out.println("Built-in length: "+len2);
    }
}
