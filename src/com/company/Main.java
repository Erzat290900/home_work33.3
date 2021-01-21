package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] arr = {2.1, 4.5, -45.5, 32.33, 56.1, -45.3, -89.65, 44.6, 78.8, -66.9, 24.12, 17.2, -108.98, 404.12, 62.3};
        {
            double sum = 0;
            for (double a : arr) {
                sum += a;

            }
            System.out.println("средний арифмет. число " + sum / arr.length);

        }


    }


}
