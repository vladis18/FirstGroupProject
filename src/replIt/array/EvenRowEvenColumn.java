package replIt.array;

public class EvenRowEvenColumn {
    public static void main(String[] args) {


        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int total=0;

        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a[i].length-1;j++){
                if (i%2==0 && j%2==0){
                    System.out.println(a[i][j]);//total=total+a[i][j];
                }
            }
            System.out.println( );
        }

        System.out.print(total);
    }
}
