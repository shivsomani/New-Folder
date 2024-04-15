
import java.util.ArrayList;
public class sunSequenceUnique 
{
    static ArrayList<String> result=new ArrayList<>();
    public static void main(String[] args) 
    {
        String input="aab";
        String output="";
        subsequence(output,input);
        System.out.println(result);
    }

    static void subsequence(String output,String input)
    {
        if(input.isEmpty())
        {
            if(!result.contains(output))
                result.add(output);

            return;
        }
        char ch=input.charAt(0);
        subsequence(output+ch,input.substring(1));
        subsequence(output,input.substring(1));
    }
}
