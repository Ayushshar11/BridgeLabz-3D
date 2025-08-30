package Strings.Level2;

import java.util.Scanner;
class WordLengthDemo {
    static int customLength(String s){
        int count=0;
        try{for(;;){s.charAt(count);count++;}}catch(Exception e){}
        return count;
    }
    static String[] customSplit(String s){
        int n=customLength(s), words=1;
        for(int i=0;i<n;i++) if(s.charAt(i)==' ') words++;
        String[] arr=new String[words];
        int start=0,idx=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                arr[idx++]=s.substring(start,i);
                start=i+1;
            }
        }
        arr[idx]=s.substring(start,n);
        return arr;
    }
    static String[][] wordWithLength(String[] arr){
        String[][] res=new String[arr.length][2];
        for(int i=0;i<arr.length;i++){
            res[i][0]=arr[i];
            res[i][1]=String.valueOf(customLength(arr[i]));
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=customSplit(s);
        String[][] res=wordWithLength(words);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0]+"\t"+Integer.parseInt(res[i][1]));
        }
    }
}
