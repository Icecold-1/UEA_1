package com.company;

public class Sphere {
    public static double UPPER_LIMIT = 5.12;
    public static double LOWER_LIMIT = -5.12;

    public static double Evaluation(double x[]) {
        int dimension = x.length;
        double sum = 0;
        for(int i=0; i < dimension; i++) {
            sum = sum + x[i]*x[i];
        }
        return sum;
    }
}
