package replIt.array;

public class DoubleArray {
    public static void main(String[] args) {
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        //prints array
//        for (int i=0; i<=a.length-1;i++){
//            for (int j=0;j<=a[i].length-1;j++){
//                System.out.print(a[i][j] +" ");
//            }
//            System.out.println();
//        }


        for (int i=0;i<=a.length-1;i++){
            for (int j =0;j<= a[i].length-1;j++){
                System.out.print((a[i][j]) * 2);
            }
            System.out.println();
        }

    }
}
