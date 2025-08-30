package Strings.Level2;

import java.util.Scanner;
class VowelConsonantTable {
    static String checkChar(char c){
        if((c>='A'&&c<='Z')) c=(char)(c+32);
        if((c>='a'&&c<='z')){
            if("aeiou".indexOf(c)!=-1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] analyze(String s){
        String[][] res=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            res[i][0]=String.valueOf(s.charAt(i));
            res[i][1]=checkChar(s.charAt(i));
        }
        return res;
    }
    static void display(String[][] arr){
        System.out.println("Char\tType");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] res=analyze(s);
        display(res);
    }
}
