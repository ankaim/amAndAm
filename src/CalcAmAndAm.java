import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcAmAndAm {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        calcAm(number);
        calcGm();
    }

    private static double calcGm() {
        Scanner x = new Scanner(System.in);
        double p = 1, a;
        int c = 0;
        while (x.hasNext()) {
            a = x.nextDouble();
            if (a >= 0) {
                c++;
                p *= a;
            } else break;
        }
        //System.out.printf("%.2f", Math.pow(p,1.0/c) );
        return Math.pow(p, 1.0 / c);
    }

    private static int calcAm(List<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return result / arr.size();
    }

}
