package Strings.Level2;

import java.util.Scanner;
class ShortestLongestWord {
    static int customLength(String s){
        int c=0;try{for(;;){s.charAt(c);c++;}}catch(Exception e){}
        return c;
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
    static int[] shortestLongest(String[] arr){
        int min=customLength(arr[0]), max=min;
        int minIdx=0,maxIdx=0;
        for(int i=1;i<arr.length;i++){
            int len=customLength(arr[i]);
            if(len<min){min=len;minIdx=i;}
            if(len>max){max=len;maxIdx=i;}
        }
        return new int[]{minIdx,maxIdx};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=customSplit(s);
        int[] idx=shortestLongest(words);
        System.out.println("Shortest: "+words[idx[0]]);
        System.out.println("Longest: "+words[idx[1]]);
    }
}
