package com.bridgelabz;

import java.util.*;

public class Gambler {
    final static int Bet_Every_Game = 1;
    static int Every_Day_Stack = 100;
    static int Loss = 0;
    static int Win = 0;
    static int gain = 0;
    static int WinDays = 0;
    static int LossDays = 0;
    static int lossing = 0;
    static int Winning = 0;

    public static void main(String[] args) {
        int Stack_Upper = 150;
        int Stack_Lower = 50;


        System.out.println("Welcome To Gambler Simulator");
        for (int day = 1; day <= 30; day++) {
            Every_Day_Stack = 100;
            while (Every_Day_Stack > Stack_Lower && Every_Day_Stack < Stack_Upper) {
                double random = Math.floor(Math.random() * 10) % 2;

                if (random == 1) {
                    Win = 1;
                    Every_Day_Stack = Every_Day_Stack + Win;
                    gain++;

                } else {
                    Loss = 1;
                    Every_Day_Stack = Every_Day_Stack - Loss;
                    gain--;
                }
            }

            if (Every_Day_Stack == Stack_Upper) {
                WinDays += 1;
                Winning = 50;

                System.out.println("winnig amt per day:" + Winning);
                System.out.println("total amount remaining   : " + Every_Day_Stack);


            } else {
                LossDays += 1;
                lossing = 50;
                System.out.println("lossing amt per day:" + lossing);
                System.out.println("total amount remaining : " + Every_Day_Stack);
            }
            if (Every_Day_Stack > 50) {
                System.out.println("luckiest day:" + day);
            } else if (Every_Day_Stack <= 50) {
                System.out.println("unluckiest day:" + day);

            }

            System.out.println(day);
        }


        System.out.println("total win days" + WinDays);
        System.out.println("total loss days" + LossDays);

        System.out.println("Total Win Days: " + WinDays + "total amount win days amount: " + Winning * WinDays);
        System.out.println("Total Loss Days: " + LossDays + "total amount loss day amount: " + lossing * LossDays);

        if (+Winning * WinDays > lossing * LossDays) {
            System.out.println("continue playing for next month");
        } else {
            System.out.println("stop playing for next month");
        }

    }
}

