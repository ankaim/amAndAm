import java.util.ArrayList;
import java.util.List;

public class CalcAmAndAm {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        calcAm(number);
    }
    private static int calcAm(List<Integer> arr){
        int result=0;
        for (int i = 0; i <arr.size(); i++) {
                result+=arr.get(i);
        }
        return result/arr.size();
    }

}
