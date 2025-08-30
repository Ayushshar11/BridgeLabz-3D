package Strings.Level2;

import java.util.*;
class StudentGrades {
    static int[][] generateScores(int n){
        Random r=new Random();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=r.nextInt(41)+60;
            arr[i][1]=r.nextInt(41)+60;
            arr[i][2]=r.nextInt(41)+60;
        }
        return arr;
    }
    static double round2(double x){
        return Math.round(x*100.0)/100.0;
    }
    static Object[][] calculate(int[][] scores){
        Object[][] res=new Object[scores.length][6];
        for(int i=0;i<scores.length;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double perc=round2(total/3.0);
            String grade;
            if(perc>=90) grade="A";
            else if(perc>=75) grade="B";
            else if(perc>=60) grade="C";
            else if(perc>=45) grade="D";
            else if(perc>=33) grade="E";
            else grade="R";
            res[i][0]=scores[i][0];
            res[i][1]=scores[i][1];
            res[i][2]=scores[i][2];
            res[i][3]=total;
            res[i][4]=perc;
            res[i][5]=grade;
        }
        return res;
    }
    static void display(Object[][] arr){
        System.out.println("Phy\tChem\tMath\tTotal\tPerc\tGrade");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] scores=generateScores(10);
        Object[][] res=calculate(scores);
        display(res);
    }
}
