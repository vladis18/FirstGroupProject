package replIt.array;

public class SumOfOddNegativeArrayTotal {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int negative=0;
        int odd=0;
        int total=0;
        for (int i=0;i<=a.length-1; i++){
            for(int j=0;j<=a[i].length-1;j++){
                if (a[i][j]<0) {
                    negative=negative+a[i][j];
                }
               else if ( a[i][j]%2!=0){
                    odd=odd+  a[i][j];
                }
                total = negative+odd;
            }
             //output=0;
        }
        System.out.print(total);
    }
}
