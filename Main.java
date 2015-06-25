package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] s = new String[t];

        /****** input ******/
        for (int i = 0; i < t ; i++) {
            s[i] = sc.next();
        }
        /****** output ******/
        for (int i = 0; i < t; i++) {
            StringBuilder sInv = new StringBuilder(s[i]);
            char[] charArray = s[i].toCharArray();
            char[] charArrayInverted = sInv.reverse().toString().toCharArray();

            for (int j = 0; j < charArray.length -1 ; j++) {
                int sDiff = Math.abs(charArray[j + 1] - charArray[j]);
                int rDiff = Math.abs(charArrayInverted[j+1] - charArrayInverted[j]);
                if (sDiff != rDiff) {
                    System.out.println("Not Funny");
                    break;
                }
                else {
                    //System.out.println(j + " " + (charArray.length -1));
                    if (j == (charArray.length -2)) {
                        System.out.println("Funny");
                    }
                }
            }
        }
    }
}
