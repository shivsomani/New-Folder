import java.util.ArrayList;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        int[] nums={4,4,4,1,4};
        List<List<Integer>> result=new ArrayList<>();
        result=subSetArray(nums);
        System.out.println(result);
    }

    static List<List<Integer>> subSetArray(int[] array)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:array)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                //if(!internal.contains(num))
                internal.add(num);

                if(!outer.contains(internal))
                {
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
