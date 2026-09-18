import java.util.Random;

public class Lab1 {

    private static final int C_SIZE = 13;
    private static final int X_SIZE = 11;

    private static final short SPECIAL_C_VALUE = 11;
    private static final short[] TANGENT_GROUP_VALUES = {6, 7, 8, 10, 15, 17};

    public static void main(String[] args) {
        short[] c = createC();
        double[] x = createX(new Random());
        double[][] b = computeMatrix(c, x);
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

    private static double[] createX(Random random) {
        double[] x = new double[X_SIZE];
        for (int j = 0; j < X_SIZE; j++) {
            // nextDouble() gives [0,1); rescale to [-3.0, 9.0)
            x[j] = -3.0 + random.nextDouble() * (9.0 - (-3.0));
        }
        return x;
    }

    private static double[][] computeMatrix(short[] c, double[] x) {
        double[][] b = new double[c.length][x.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                b[i][j] = computeElement(c[i], x[j]);
            }
        }
        return b;
    }

    private static boolean isInTangentGroup(short ci) {
        for (short value : TANGENT_GROUP_VALUES) {
            if (value == ci) {
                return true;
            }
        }
        return false;
    }

    private static double computeElement(short ci, double x) {
        if (ci == SPECIAL_C_VALUE) {
            return Math.asin(0.1 * (3.0 / 4.0) * (x + 3) / 12.0);
        }
        if (isInTangentGroup(ci)) {
            return Math.sin(Math.pow(0.25 * Math.tan(x), 3));
        }
        double base = (Math.PI / 2.0) * (Math.abs(x) + 1);
        return Math.sin(0.25 * Math.log(Math.pow(base, x)));
    }

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
