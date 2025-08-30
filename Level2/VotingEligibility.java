package Strings.Level2;

import java.util.*;
class VotingEligibility {
    static int[] randomAges(int n){
        Random r=new Random();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=10+r.nextInt(90);
        return arr;
    }
    static String[][] canVote(int[] arr){
        String[][] res=new String[arr.length][2];
        for(int i=0;i<arr.length;i++){
            res[i][0]=String.valueOf(arr[i]);
            if(arr[i]<0) res[i][1]="false";
            else if(arr[i]>=18) res[i][1]="true";
            else res[i][1]="false";
        }
        return res;
    }
    static void display(String[][] arr){
        System.out.println("Age\tCanVote");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
    }
    public static void main(String[] args){
        int[] ages=randomAges(10);
        String[][] res=canVote(ages);
        display(res);
    }
}
