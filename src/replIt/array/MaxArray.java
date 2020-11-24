package replIt.array;

public class MaxArray {
    public static void main(String[] args)
    {
        int[][] a = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        int max=0;
        for (int i=0;i<=a.length -1; i++){
            for (int j=0; j <= a[i].length-1;j++){
                if( a[i][j] > max){

                    max=a[i][j];
                }
            }
        }
        System.out.print(max);
    }

}
