public class findGCD {
    public static void main(String[] args) {
        int min=37;
        int max=19;

        while(min!=0)
        {
            if(max>min)
                max=max-min;
            else if(min>=max)
                min=min-max;
        }
        System.out.println("The GCD is:"+max);
    }
}
