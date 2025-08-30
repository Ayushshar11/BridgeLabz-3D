package Strings.Level1;

import java.util.Scanner;
class StringIndexOutDemo {
    static void generate(String s){
        System.out.println(s.charAt(s.length()));
    }
    static void handle(String s){
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled: "+e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //generate(s); // abrupt
        handle(s);
    }
}
