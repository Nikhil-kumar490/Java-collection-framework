import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_list1 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        List<String>list1= Arrays.asList("Mango","Orange");
        System.out.println(list1.getClass().getName());
        list1.set(1,"w");
        System.out.println(list1.get(1));

        String[] array= {"A","B"};
        List<String> list2=Arrays.asList(array);
        System.out.println(list1.getClass().getName());
    }
}
