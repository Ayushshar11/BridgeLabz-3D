package Strings.Level2;

import java.util.*;
class RockPaperScissors {
    static String computerChoice(){
        int x=(int)(Math.random()*3);
        if(x==0) return "rock";
        if(x==1) return "paper";
        return "scissors";
    }
    static String winner(String user,String comp){
        if(user.equals(comp)) return "draw";
        if(user.equals("rock")&&comp.equals("scissors")) return "user";
        if(user.equals("paper")&&comp.equals("rock")) return "user";
        if(user.equals("scissors")&&comp.equals("paper")) return "user";
        return "computer";
    }
    static String[][] stats(ArrayList<String[]> games){
        int userWins=0,compWins=0,draws=0;
        for(String[] g:games){
            if(g[2].equals("user")) userWins++;
            else if(g[2].equals("computer")) compWins++;
            else draws++;
        }
        int total=games.size();
        String[][] res=new String[3][2];
        res[0][0]="UserWins";res[0][1]=userWins+" ("+(userWins*100/total)+"%)";
        res[1][0]="ComputerWins";res[1][1]=compWins+" ("+(compWins*100/total)+"%)";
        res[2][0]="Draws";res[2][1]=draws+" ("+(draws*100/total)+"%)";
        return res;
    }
    static void display(ArrayList<String[]> games,String[][] summary){
        System.out.println("User\tComputer\tWinner");
        for(String[] g:games) System.out.println(g[0]+"\t"+g[1]+"\t"+g[2]);
        System.out.println("\nSummary:");
        for(String[] s:summary) System.out.println(s[0]+"\t"+s[1]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String[]> games=new ArrayList<>();
        for(int i=0;i<n;i++){
            String user=sc.next().toLowerCase();
            String comp=computerChoice();
            String win=winner(user,comp);
            games.add(new String[]{user,comp,win});
        }
        String[][] summary=stats(games);
        display(games,summary);
    }
}
