package iyaaut.mpltest;

import naphon.ai.ai.exceptions.AIException;
import naphon.ai.regressions.MultipleLinearRegression;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MultipleLinearRegression lr = new MultipleLinearRegression();
        try {
            lr.train(Arrays.asList(new double[]{171.9d, 100.5d},
                            new double[]{176.6, 101.6},
                            new double[]{174.4, 112.2},
                            new double[]{167.7, 62.2},
                            new double[]{160.5, 68.5},
                            new double[]{175.5, 98.5},
                            new double[]{177.7, 83.3},
                            new double[]{168.8, 92.2},
                            new double[]{177.7, 86.6},
                            new double[]{159.5, 82.2},
                            new double[]{155.5, 76.6},
                            new double[]{159.5, 74.5},
                            new double[]{167.5, 60.5},
                            new double[]{158.5, 70.5},
                            new double[]{168.5, 64.5},
                            new double[]{162.5, 68.5},
                            new double[]{177.5, 90.5},
                            new double[]{168.5, 72.5},
                            new double[]{175.5, 86.5},
                            new double[]{165.5, 73.5},
                            new double[]{172.5, 98.5},
                            new double[]{156.5, 68.5},
                            new double[]{170.5, 62.5},
                            new double[]{156.5, 60.5},
                            new double[]{153.5, 59.5},
                            new double[]{163.5, 62.5},
                            new double[]{160.5, 62.5},
                            new double[]{153.5, 72.5},
                            new double[]{169.5, 62.5},
                            new double[]{173.5, 78.5},
                            new double[]{170.5, 100.5}),
                    Arrays.asList(86.6, 96.6, 95.5, 44.5, 44.4, 75.5, 52.2, 50.5, 71.5, 62.2, 52.5, 58.5, 44.5, 50.5, 50.5, 48.5, 85.5, 47.5, 69.5, 55.5, 46.5, 54.5, 45.5, 38.5, 41.5, 40.5, 41.5, 52.5, 44.5, 51.5, 80.5));
        } catch (AIException e) {
            throw new RuntimeException(e);


        }
        try {
            double weightkey1 = lr.predict(new double[]{176.5, 101.5});
            System.out.println(weightkey1);
        } catch (AIException e) {
            throw new RuntimeException(e);
        }
    }
}