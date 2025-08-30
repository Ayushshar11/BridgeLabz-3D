package Strings.Level2;

import java.util.Scanner;
class SplitWordsDemo {
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
    static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr1=customSplit(s);
        String[] arr2=s.split(" ");
        System.out.println("Comparison: "+compareArrays(arr1,arr2));
    }
}
