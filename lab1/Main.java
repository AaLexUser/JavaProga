package com.company;

public class Main {

    public static void main(String[] args) {
        short a[] = new short[8];
        int counter = 0; //counter for the elements of the array a
        for (int i = 6; i <= 20; i += 2) {
            a[counter] = (short) i;
            counter++;
        }
        float x[] = new float[17];
        for (int i = 0; i < 17; i++) {
            x[i] = (float) (-3 + Math.random() * 18);//Get a random number between -3 and 15
        }
        double ans[][] = new double[8][17];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (a[i] == 16) {
                    ans[i][j] = Math.pow(Math.E, Math.pow(((2.0 / 3) + x[j] * (x[j] - 1)), 3));
                } else if (a[i] == 6 || a[i] == 12 || a[i] == 18 || a[i] == 20) {
                    ans[i][j] = (1.0 / 3) * Math.log((Math.pow(Math.abs(x[j]) + 1, x[j])));
                } else {
                    ans[i][j] = (1.0 / 2) / (3 - Math.atan(Math.cos(x[j])));
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 17; j++) {
                if (Double.isInfinite(ans[i][j]) || ans[i][j] > 10000000){
                    System.out.print("Infin\t");//Infinity name is too long replace with Infin
                }
                else System.out.printf("%.2f\t", (float) ans[i][j]);
            }
            System.out.print("\n");
        }
    }
}