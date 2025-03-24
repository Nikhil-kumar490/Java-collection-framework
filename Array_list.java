import java.util.ArrayList;

public class Array_list {
   public static void main(String [] a){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(5);
       list.add(60);

       list.remove(2);
       list.add(2,30);
       list.set(0,8);
       System.out.println(list);

       for(int x:list){
           System.out.println(x);
       }

       System.out.println(list.get(2));
       System.out.println(list.size());
       //for exixtance
       System.out.println(list.contains(5));
       System.out.println(list.contains(50));

       }


   }

