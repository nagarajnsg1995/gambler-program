package com.bridgelabz;

import java.util.*;

public class Gambler {
    final static int Bet_Every_Game = 1;
    static int Every_Day_Stack = 100;
    static int Loss = 0;
    static int gain = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Gambler Simulator");

        double random = Math.floor(Math.random() * 10) % 2;
        System.out.println(random);
        if (random == 1) {
            int win = 1;
            Every_Day_Stack = Every_Day_Stack + win;
            gain++;

            System.out.println("wins: " + win + " gains: " + gain);
            System.out.println("total winning : " + Every_Day_Stack);
        } else {
            int loss = 1;
            Every_Day_Stack = Every_Day_Stack - loss;
            gain--;

            System.out.println("loss : " + loss + "gains: " + gain);
            System.out.println("total lossed : " + Every_Day_Stack);

        }
    }
}