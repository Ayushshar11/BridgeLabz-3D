package Strings.Level3;

import java.util.*;
class BMICalculator {
    static String[] bmiStatus(double weight,double heightCm){
        double h=heightCm/100.0;
        double bmi=weight/(h*h);
        String status;
        if(bmi<18.5) status="Underweight";
        else if(bmi<25) status="Normal";
        else if(bmi<30) status="Overweight";
        else status="Obese";
        return new String[]{String.format("%.2f",bmi),status};
    }
    static String[][] process(double[][] arr){
        String[][] res=new String[arr.length][4];
        for(int i=0;i<arr.length;i++){
            String[] bmi=bmiStatus(arr[i][0],arr[i][1]);
            res[i][0]=String.valueOf(arr[i][0]);
            res[i][1]=String.valueOf(arr[i][1]);
            res[i][2]=bmi[0];
            res[i][3]=bmi[1];
        }
        return res;
    }
    static void display(String[][] arr){
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<4;j++) System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }
        String[][] res=process(data);
        display(res);
    }
}
