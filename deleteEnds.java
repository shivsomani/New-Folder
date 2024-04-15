public class deleteEnds {
    public static void main(String[] args) {
        String s="aabccabba";

        System.out.println(deleteSimilarEnds(s));

    }
    public static int deleteSimilarEnds(String name)
    {
        int ans=0;
        if(name.charAt(0)!=name.charAt(name.length()-1))
        {
            ans=name.length();
        }

        if(name.charAt(0)==name.charAt(name.length()-1))
        {
            deleteSimilarEnds(name.substring(1, name.length()-2));
        }
        return ans;
    }
}
