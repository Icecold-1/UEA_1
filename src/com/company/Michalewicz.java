package com.company;

public class Michalewicz {
    public static double UPPER_LIMIT = Math.PI;
    public static double LOWER_LIMIT = 0;

    public static double Evaluation(double x[]){
        int dimension = x.length;
        int m = 10;
        double sum = 0;

        for(int i=0; i<dimension; i++) {
            sum=sum+Math.sin(x[i])*Math.pow(Math.sin(i*Math.pow(x[i],2)/Math.PI),(2*m));
        }

        return -sum;
    }
}
