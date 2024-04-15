public class cyclicSort {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        int index=0;

        /* 
        System.out.println("Initial Array: ");
        for (index=0;index<nums.length;index++)
        {
            System.out.print("|" +nums[index] );
        }
        System.out.print("|");
        System.out.println( );*/
        
        display(nums);

        while(index<nums.length)
        {
            int correct=nums[index]-1;
            if(nums[index]!=nums[correct])
            {
                swap(nums,index,correct);
            }
            else
            {
                index++;
            }
        }

        display(nums);
    
        /* 
        System.out.println("Array after sorting: ");
        for (index=0;index<nums.length;index++)
        {
            System.out.print("|" +nums[index] );
        }
        System.out.print("|");
        */

    }

    public static void swap(int array[],int first,int second)
    {
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }

    public static void display(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
