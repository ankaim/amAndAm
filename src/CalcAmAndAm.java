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

        selectMetod();

    }

    private static void selectMetod() {
        System.out.println("Введите ключ -am, если хотите узнать среднее арифмитическое.\n Если хотите узнать среднее геометрическое, введите -gm");

        while (true) {
            sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals(math)) {
                calcAm(getNumbers());
                break;
            }
            if (str.equals(geom)) {
                calcGm(getNumbers());
                break;
            }
            System.out.println("Вы ввели не кокректный ключ, попробуйте еще раз.");
        }
    }

    private static List<Integer> getNumbers() {
        number = new ArrayList<>();
        int s = 0;
        System.out.println("Введите числа. Пустой ввод - остановка ввода.");
        sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();

            if (str.equals("")) {
                break;
            } else if (Integer.parseInt(str) < 0) {
                System.out.println("Вы ввели отрицательное число, попробуйте еще раз.");
                continue;
            } else {
                try {
                    number.add(Integer.parseInt(str));
                } catch (Exception e) {
                    System.out.println("Вы ввели что то не то!");
                    continue;
                }
            }

        }
        return number;
    }

    private static void calcGm(List<Integer> number) {
        double p = 1, a;
        int c = 0;
        for (Integer it : number) {
            a = it;
            c++;
            p *= a;
        }
        System.out.printf("Среднее геометрическое = " + "%.2f", Math.pow(p, 1.0 / c));
    }

    private static void calcAm(List<Integer> number) {
        double result = 0;
        int count = 0;
        for (Integer it : number) {
            result += it;
            count++;
        }
        System.out.println("Среднее арифметическое = " + result / count);
    }
}