public class factors {
    public static void main(String[] args) {
        int min=6;
        int max=9;

        /* 
        int index=0;
        int index1=0;
        int ans=0;

        int[] factor1=new int[min/2];
        int[] factor2=new int[max/2];

        for(int i=1;i<=min/2;i++)
        {
            if(min%i==0)
            {
                factor1[index++]=i;
            }
        }

        for(int i=0;i<factor1.length;i++)
        {
            System.out.print(factor1[i]+" ");
        }

        for(int i=1;i<=max/2;i++)
        {
            if(max%i==0)
            {
                factor2[index1++]=i;
            }
        }
        System.out.println();
        for(int i=0;i<factor2.length;i++)
        {
            System.out.print(factor2[i]+" ");
        }

        if(findMax(factor1)==findMax(factor2))
        {
            ans=findMax(factor1);
        }
        System.out.println();
        System.out.println(ans);

        
        */

        int ans=findGCD(max,min);
        System.out.println(ans);
    }

    public static int findMax(int[] array)
    {
        int max=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }

    public static int findGCD(int max,int min)
    {
        int factor=0;
        if(max!=0)
        {
            factor=max%min;
        }
        return factor;
    }
}
