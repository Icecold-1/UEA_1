package com.company;

public class Rastrigin {
    public static double UPPER_LIMIT = 5.12;
    public static double LOWER_LIMIT = -5.12;

    public static double Evaluation(double x[]) {
        int dimension = x.length;
        double sum = 0;

        for(int i=0; i<dimension; i++){
            sum = sum+(Math.pow(x[i], 2)-10*Math.cos(2*Math.PI*x[i]));
        }

        return 10*dimension+sum;
    }
}
