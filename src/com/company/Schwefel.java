package com.company;

public class Schwefel {
    public static int UPPER_LIMIT = 600;
    public static int LOWER_LIMIT = -600;

    public static double Evaluation(double x[]) {
        int dimension = x.length;
        double sumTMP = 0;
        double sum;

        for(int i = 0; i < dimension; i++) {
            sumTMP = sumTMP + (-x[i]*Math.sin(Math.sqrt(Math.abs(x[i]))));
        }
        sum = sumTMP;

        return 418.9829*dimension+sum;
    }
}
