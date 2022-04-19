import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for(int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0)
                if (intList.get(i)%2 == 0)
                List.add(intList.get(i));
            }
        Collections.sort(List);
        System.out.println(List);
    }
}
