
import java.util.ArrayList;
public class subSequence 
{
    static ArrayList<String> result=new ArrayList<>();
    public static void main(String[] args) 
    {
        //String s = "abcde";
        String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};

        String input="dsahjpjauf";
        String output="";
        subsequence(output,input);
        //System.out.println(result);

        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+" ");
        }

        System.out.println();
        int count=0;
        //int j=0;

        for(int j=0;j<words.length;j++)
        {
            for(int i=0;i<result.size();i++)
            {
                String name1=words[j];
                String name2=result.get(i);

                if(words[j].equals(result.get(i)))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void subsequence(String output,String input)
    {
        if(input.isEmpty())
        {
            result.add(output);
            //System.out.println(output);
            return;
        }
        char ch=input.charAt(0);
        subsequence(output+ch,input.substring(1));
        subsequence(output,input.substring(1));
        //subsequence(output+(ch+0),input.substring(1));
    }
}
