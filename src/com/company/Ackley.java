package com.company;

public class Ackley {
    public static int UPPER_LIMIT=30;
    public static int LOWER_LIMIT=-15;

    public static double Evaluation(double x[]) {
        int dimension = x.length;
        double sum1=0, sum2=0;
        double a=20, b=0.2, c=2*Math.PI;
        for(int i=0; i<dimension; i++){
            sum1 = sum1 + Math.pow(x[i], 2);
            sum2 = sum2 + Math.cos(c*x[i]);
        }
        return -a*Math.exp(-b*Math.sqrt(1/(dimension*sum1)))-Math.exp(1/(dimension*sum2))+a+Math.exp(1);
    }
}
