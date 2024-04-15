import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> result1=new ArrayList<>();
        List<List<Integer>> result2=new ArrayList<>();

        result.add(new ArrayList<>());
        result2.add(new ArrayList<>());
        //result1.add(new ArrayList<>());         
        //We cannot do this since result1 is just an array list and not a List of list.
                                                
        System.out.println("Result:" +result);
        System.out.println("Result1:" +result1);

       
    }
}
