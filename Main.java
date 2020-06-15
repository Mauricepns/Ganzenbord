package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {


    static Scanner scan = new Scanner(System.in);
    static boolean spel = true;
    static int plek = 0;
    static int plekTeVeel = 0;


    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Je staat op start. Gooi je dobbelsteen (g)");

        while (spel) {

            scan.nextLine();
            int dobbel = random.nextInt(6) +1;
            plek = plek + dobbel;

            if (plek < 63 ) {
                System.out.println("Je hebt " + dobbel + " gegooid. Je staat op plek: " + plek );
            }
            if (plek == 6) {
                plek = 12;
                System.out.println("Brug! ga door naar plek 12");
            }
            if (plek == 10 || plek == 20 || plek == 30 || plek == 40 || plek == 50 || plek == 60) {
                plek = plek + dobbel;
                System.out.println("Bonus stapjes! Je staat nu op plek " + plek);
            }
            if (plek == 23) {
                spel = false;
                System.out.println("Gevangenis! Het spel is over");
            }
            if (plek == 25 || plek == 45 ) {
                plek = 0;
                System.out.println("Ga terug naar start!");
            }
            if (plek > 63 ) {
                plekTeVeel = plek - 63;
                System.out.println("Je gooide " + dobbel + " Helaas! Te veel gegooid! Ga " + plekTeVeel  + " stapjes terug");
                plek = 63 - plekTeVeel;
                System.out.println("Je staat nu op plek " + plek + ".");
                plekTeVeel = 0;
            }
            if (plek == 63 ) {
                System.out.println("Gefeliciteerd, je hebt gewonnen!");
                // wil je door gaan? JA / NEE --- True / false
                spel = false;
            }
        }
    }
}
