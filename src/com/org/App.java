package com.dpwn.newops.checkrouting.server;


import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Press Enter to continue: " );

        // Generating B column along with value assignment as expected for Bingo card.

        // Values for b1, b2, b3, b4, b5 In between 1 to 15 and should not be repeated values

        int b1 = (int) (Math.random() * (15 - 1) + 1);
        int b2 = b1, b3 = b1, b4 = b1, b5 = b1;

        while (b2 == b1) {
            b2 = (int) (Math.random() * (15 - 1) + 1);
        }
        while (b3 == b1 || b3 == b2) {
            b3 = (int) (Math.random() * (15 - 1) + 1);
        }
        while (b4 == b1 || b4 == b2 || b4 == b3) {
            b4 = (int) (Math.random() * (15 - 1) + 1);
        }
        while (b5 == b1 || b5 == b2 || b5 == b3 || b5 == b4) {
            b5 = (int) (Math.random() * (15 - 1) + 1);
        }

        // Generating I column along with value assignment as expected for Bingo card.

        // Values for i1, i2, i3, i4, i5 In between 16 to 30 and should not be repeated values

        int i1 = (int) (Math.random() * (30 - 16) + 16);
        int i2 = i1, i3 = i1, i4 = i1, i5 = i1;

        while (i2 == i1) {
            i2 = (int) (Math.random() * (30 - 16) + 16);
        }
        while (i3 == i1 || i3 == i2) {
            i3 = (int) (Math.random() * (30 - 16) + 16);
        }
        while (i4 == i1 || i4 == i3 || i4 == i2) {
            i4 = (int) (Math.random() * (30 - 16) + 16);
        }
        while (i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4) {
            i5 = (int) (Math.random() * (30 - 16) + 16);
        }

        // Generating N column along with value assignment as expected for Bingo card.

        // Values for n1, n2, n3, n4, n5 In between 16 to 30 and should not be repeated values

        int n1 = (int) (Math.random() * (45 - 31) + 31);
        int n2 = n1, n4 = n1, n5 = n1;

        while (n2 == n1) {
            n2 = (int) (Math.random() * (45 - 31) + 31);
        }

        while (n4 == n1 || n4 == n2) {
            n4 = (int) (Math.random() * (45 - 31) + 31);
        }
        while (n5 == n1 || n5 == n2 || n5 == n4) {
            n5 = (int) (Math.random() * (45 - 31) + 31);
        }


        // Generating G column along with value assignment as expected for Bingo card.

        // Values for g1, g2, g3, g4, g5 In between 31 to 45 and should not be repeated values

        int g1 = (int) (Math.random() * (60 - 46) + 46);
        int g2 = g1, g3 = g1, g4 = g1, g5 = g1;

        while (g2 == g1) {
            g2 = (int) (Math.random() * (60 - 46) + 46);
        }
        while (g3 == g1 || g3 == g2) {
            g3 = (int) (Math.random() * (60 - 46) + 46);
        }
        while (g4 == g1 || g4 == g3 || g4 == g2) {
            g4 = (int) (Math.random() * (60 - 46) + 46);
        }
        while (g5 == g1 || g5 == g2 || g5 == g3 || g5 == g4) {
            g5 = (int) (Math.random() * (60 - 46) + 46);
        }


        // Generating O column along with value assignment as expected for Bingo card.

        // Values for o1, o2, o3, o4, o5 In between 46 to 60 and should not be repeated values

        int o1 = (int) (Math.random() * (75 - 61) + 61);
        int o2 = o1, o3 = o1, o4 = o1, o5 = o1;

        while (o2 == o1) {
            o2 = (int) (Math.random() * (75 - 61) + 61);
        }
        while (o3 == o1 || o3 == o2) {
            o3 = (int) (Math.random() * (75 - 61) + 61);
        }
        while (o4 == o1 || o4 == o2 || o4 == o3) {
            o4 = (int) (Math.random() * (75 - 61) + 61);
        }
        while (o5 == o1 || o5 == o2 || o5 == o3 || o5 == o4) {
            o5 = (int) (Math.random() * (75 - 61) + 61);
        }

        //Print BINGO card

        System.out.println("\n");
        System.out.println(" **********************");
        System.out.println(" * B * I * N * G * O *");
        System.out.println(" **********************");
        System.out.println(" *   *   *   *   *   *   *  ");
        System.out.println(String.format(" " + b1 + " * " + i1 + " * " + n1 + " * " + g1 + " * " + o1));
        System.out.println(" *   *   *   *   *   *   *  ");
        System.out.println(String.format(" " + b2 + " * " + i2 + " * " + n2 + " * " + g2 + " * " + o2));
        System.out.println(" *   *   *   *   *   *   *  ");
        System.out.println(String.format(" " + b3 + " * " + i3 + " * " + "FREE" + " * " + g3 + " * " + o3));
        System.out.println(" *   *   *   *   *   *   *  ");
        System.out.println(String.format(" " + b4 + " * " + i4 + " * " + n4 + " * " + g4 + " * " + o4));
        System.out.println(" *   *   *   *   *   *   *  ");
        System.out.println(String.format(" " + b5 + " * " + i5 + " * " + n5 + " * " + g5 + " * " + o5));
        System.out.println(" *   *   *   *   *   *   *  ");
        
    }
}
