package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static Random rnd;
    public static double RandomMeja(double spMeja, double zgMeja){
        double interval = spMeja - zgMeja;
        return interval*rnd.nextDouble();
    }

    public static double[] randomX(double spMeja, double zgMeja, int dimension) {
        double[] result = new double[dimension];
        for(int i=0; i<dimension; i++){
            result[i] = RandomMeja(spMeja, zgMeja);
        }
        return result;
    }

    public static void selectedFunction(int problem) {
        if(problem == 1)
            System.out.println("You have chosen SPHERE");
        else if (problem == 2)
            System.out.println("You have chosen ACKLEY");
        else if (problem == 3)
            System.out.println("You have chosen SCHWEFEL");
        else if (problem == 4)
            System.out.println("You have chosen LEVY");
        else if (problem == 5)
            System.out.println("You have chosen MICHALEWICZ");
        else if (problem == 6)
            System.out.println("You have chosen RASTRIGIN");
    }

    public static void main(String[] args) {
	// write your code here
        int problem = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);
        int FES = Integer.parseInt(args[2]);
        boolean flag = true;

        double[] bestX,tmp = null;
        bestX=null;
        double best = Double.MAX_VALUE, tmpEval = 0;
        rnd = new Random();

        selectedFunction(problem);

        for(int i = 0; i < FES; i++) {
            if(problem < 7 && problem > 0) {
                if (problem == 1) {
                    tmp = randomX(Sphere.LOWER_LIMIT, Sphere.UPPER_LIMIT, D);
                    tmpEval = Sphere.Evaluation(tmp);
                } else if (problem == 2) {
                    tmp = randomX(Ackley.LOWER_LIMIT, Ackley.UPPER_LIMIT, D);
                    tmpEval = Ackley.Evaluation(tmp);
                } else if (problem == 3) {
                    tmp = randomX(Schwefel.LOWER_LIMIT, Schwefel.UPPER_LIMIT, D);
                    tmpEval = Schwefel.Evaluation(tmp);
                } else if (problem == 4) {
                    tmp = randomX(Levy.LOWER_LIMIT, Levy.UPPER_LIMIT, D);
                    tmpEval = Levy.Evaluation(tmp);
                } else if (problem == 5) {
                    tmp = randomX(Michalewicz.LOWER_LIMIT, Michalewicz.UPPER_LIMIT, D);
                    tmpEval = Michalewicz.Evaluation(tmp);
                } else {
                    tmp = randomX(Rastrigin.LOWER_LIMIT, Rastrigin.UPPER_LIMIT, D);
                    tmpEval = Rastrigin.Evaluation(tmp);
                }
                if (best > tmpEval) {
                    best = tmpEval;
                    bestX = tmp;
                    System.out.println(i + " Best found: " + best + " " + Arrays.toString(bestX));
                }
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Best found: " + best + " " + Arrays.toString(bestX));
        else
            System.out.println("THERE HAS BEEN AN ERROR!");
    }
}
