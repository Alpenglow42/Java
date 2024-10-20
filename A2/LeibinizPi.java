public class LeibinizPi {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double pi = calculatePi(i);
            System.out.println("For i = " + i + ", pi is approximately: " + pi);
        }
    }

    public static double calculatePi(int i) {
        double pi = 0.0;
        for (int j = 0; j <= i; j++) {
            double term = (j % 2 == 0) ? 1.0 / (2 * j + 1) : -1.0 / (2 * j + 1);
            pi += term;
        }
        pi *= 4; // Multiply by 4 as per the formula
        return pi;

    }
}


//https://en.wikipedia.org/wiki/Leibniz_formula_for_%CF%80
//https://ispycode.com/Blog/java/2017-03/Leibniz-Formula-for-PI
//https://stackoverflow.com/questions/26455210/write-a-program-to-estimate-pi-%CF%80-using-the-leibniz-series-in-java