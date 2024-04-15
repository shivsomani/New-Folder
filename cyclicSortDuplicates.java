public class cyclicSortDuplicates {
    public static void main(String[] args) {
        int[] nums={3,5,4,1,3};
        int index=0;

        /* 
        System.out.println("Initial Array: ");
        for (index=0;index<nums.length;index++)
        {
            System.out.print("|" +nums[index] );
        }
        System.out.print("|");
        System.out.println( );*/
        
        System.out.println("Initial Array: ");
        displayDuplicate(nums);

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

        System.out.println("Array after sorting: ");
        displayDuplicate(nums);
    
        /* 
        System.out.println("Array after sorting: ");
        for (index=0;index<nums.length;index++)
        {
            System.out.print("|" +nums[index] );
        }
        System.out.print("|");
        */
        /* 
        int num=0;
        while(num<nums.length)
        {
            if(nums[num]!=num+1)
            {
                System.out.println(index+1);
            }
        }*/
       
    }

    public static void swap(int array[],int first,int second)
    {
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }

    /* 
    public static void findDuplicates(int[] array)
    {
        int index=0;
        while(index<array.length)
        {
            if(array[index]!=index+1)
            {
                System.out.println(index+1);
            }
            else
            {
                index++;
            }
        }
    }*/

    public static void displayDuplicate(int[] array)
    {
        //System.out.println("Array after sorting: ");
        for (int index=0;index<array.length;index++)
        {
            if(array[index]!=index+1)
            {
                System.out.print("|" +array[index] );
            }
            
        }
        System.out.print("|"+ "\n");
    }
}
