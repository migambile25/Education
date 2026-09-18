import java.util.Random;

public class Lab1 {
    
    private static final int C_SIZE = 13;
    private static final int X_SIZE = 11;

    public static void main(String[] args) {
        short[] c = createC();
        double[] x = createX();
        double[][] b = createB(c, x);
        printMatrix(b);
    }

    private static short[] createC() {
        short[] c = new short[C_SIZE];
        for (int i = 0; i < C_SIZE; i++) {
            // 5 + i is int so casting to short
            c[i] = (short) (5 + i);
        }
        return c;
    }

    private static double[] createX() {
        double[] x = new double[X_SIZE];
        Random random = new Random();
        for (int j = 0; j < X_SIZE; j++) {
            // nextDouble() gives [0,1); rescale to [-3.0, 9.0)
            x[j] = -3.0 + random.nextDouble() * (9.0 - (-3.0));
        }
        return x;
    }

    // " method to compute  the 2D array elements
    private static double[][] createB(short[] c, double[] x) {
        double[][] b = new double[c.length][x.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                b[i][j] = computeElement(c[i], x[j]);
            }
        }
        return b;
    }

    private static boolean isInSecondGroup(short ci) {
        return ci == 6 || ci == 7 || ci == 8 || ci == 10 || ci == 15 || ci == 17;
    }

    private static double computeElement(short ci, double x) {
        if (ci == 11) {

            return Math.asin(0.1 * (3.0 / 4.0) * (x + 3) / 12.0);
        } else if (isInSecondGroup(ci)) {
            return Math.sin(Math.pow(0.25 * Math.tan(x), 3));
        } else {
            double base = (Math.PI / 2.0) * (Math.abs(x) + 1);
            return Math.sin(0.25 * Math.log(Math.pow(base, x)));
        }
    }

    // "method to print the matrix"
    private static void printMatrix(double[][] b) {
        for (double[] row : b) {
            StringBuilder line = new StringBuilder();
            for (double value : row) {
                // %10.4f: 4 decimal places, width 10 for column alignment; NaN prints as "NaN"
                line.append(String.format("%10.4f", value));
            }
            System.out.println(line);
        }
    }
}
