package Strings.Level3;

import java.util.*;
class UniqueCharacters {
    static int length(String s){
        int c=0;
        try{while(true){s.charAt(c);c++;}}catch(Exception e){}
        return c;
    }
    static char[] unique(String s){
        int n=length(s);
        char[] res=new char[n];
        int idx=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++) if(s.charAt(j)==c) found=true;
            if(!found) res[idx++]=c;
        }
        char[] ans=new char[idx];
        for(int i=0;i<idx;i++) ans[i]=res[i];
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] u=unique(s);
        for(char c:u) System.out.print(c+" ");
    }
}
