public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoD={{1,2,3},{3,4,5},{5,6,7}};

        System.out.println("The length of the twoD array is:" + twoD.length);
        System.out.println("The length of the first row of twoD array is:" + twoD[0].length);

        for(int i=0;i<twoD.length;i++)
        {
            for(int j=0;j<twoD[0].length;j++)
            {
                System.out.print(twoD[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
