//Trying to reverse a string using stacks.

import java.util.Stack;
public class withStacks 
{
    public static void main(String[] args) 
    {
        Stack<String> result=new Stack<>();
        Stack<Character> result1=new Stack<>();
        String name="Shivam Somani";
       // result.push(name);
        //System.out.println(result.pop());

        String answer="";
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)!=' ')
            {
                result1.push(name.charAt(i));   
            }
            else if(name.charAt(i)==' ')
            {
                while(!result1.isEmpty())
                {
                    answer=answer+result1.pop();
                }
                result1.push(' ');
            }
        }
        System.out.println(answer);
    }
}
