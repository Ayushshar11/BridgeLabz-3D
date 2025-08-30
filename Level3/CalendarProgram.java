package Strings.Level3;

import java.util.*;
class CalendarProgram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        Calendar cal=new GregorianCalendar(year,month-1,1);
        int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=1;i<cal.get(Calendar.DAY_OF_WEEK);i++) System.out.print("    ");
        for(int d=1;d<=days;d++){
            System.out.printf("%3d ",d);
            if((d+cal.get(Calendar.DAY_OF_WEEK)-1)%7==0) System.out.println();
        }
    }
}
