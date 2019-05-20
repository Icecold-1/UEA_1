package com.company;

public class Levy {
    public static int UPPER_LIMIT = 10;
    public static int LOWER_LIMIT = -10;

    public static double Evaluation(double x[]) {
        int dimension = x.length;
        double[] z = new double[dimension];
        for(int i=0; i<dimension; i++) {
            z[i]=1+(x[i]-1/4);
        }

        double sum = Math.pow(Math.sin(Math.PI*z[1]), 2);

        for(int j=0; j<dimension-1; j++) {
            sum = sum+Math.pow(z[j]-1,2)*(1+10*(Math.pow(Math.sin(Math.PI*z[j]+1),2)));
        }
        return sum+Math.pow(z[dimension-1]-1,2)*Math.pow(1+Math.sin(2*Math.PI*z[dimension-1]),2);
    }
}
