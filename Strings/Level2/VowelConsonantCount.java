package Strings.Level2;

import java.util.Scanner;
class VowelConsonantCount {
    static boolean isLetter(char c){
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }
    static boolean isVowel(char c){
        c=(c>='A'&&c<='Z')?(char)(c+32):c;
        return "aeiou".indexOf(c)!=-1;
    }
    static int[] countVC(String s){
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isLetter(ch)){
                if(isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] res=countVC(s);
        System.out.println("Vowels: "+res[0]+" Consonants: "+res[1]);
    }
}
