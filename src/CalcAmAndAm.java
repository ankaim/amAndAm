import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Два метода для подсчета среднего арифметического и геометрического
public class CalcAmAndAm {
    static Scanner sc;
    static List<Integer> number;
    private static final String math = "-am";
    private static final String geom = "-gm";

    public static void main(String[] args) {
        number = new ArrayList<>();

        selectMetod();

    }

    private static void selectMetod() {
        System.out.println("Введите ключ -am, если хотите узнать среднее арифмитическое.\n Если хотите узнать среднее геометрическое, введите -gm");
        while (true) {
            sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals(math)) {
                calcAm();
                break;
            }
            if (str.equals(geom)) {
                calcGm();
                break;
            }
            System.out.println("Вы ввели не кокректный ключ, попробуйте еще раз.");
        }
    }

    private static void calcGm() {
        System.out.println("Введите числа. Отрицательно число - остановка ввода.");
        sc = new Scanner(System.in);
        double p = 1, a;
        int c = 0;
        while (sc.hasNext()) {
                a = sc.nextDouble();
                if (a >= 0) {
                    c++;
                    p *= a;
                }else break;
        }
        System.out.printf("%.2f", Math.pow(p, 1.0 / c));
        //return Math.pow(p, 1.0 / c);
    }

    private static void calcAm() {
        System.out.println("Введите числа. Пустой ввод - остановка ввода.");
        sc = new Scanner(System.in);
        double result = 0;
        int count = 0;
        while (true) {
            String num = sc.nextLine();
            if (num.equals("")) {
                break;
            } else {
                result += Integer.parseInt(num);
                count++;
            }
        }
        System.out.println(result / count);
    }

}