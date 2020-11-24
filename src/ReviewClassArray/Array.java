package ReviewClassArray;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] intArr={3,5,7,1,15};
        String  [][][] arr3d =new String [2][2][3];
        //2 floors
        //2 apartments
        //3 rooms in each apartments

        Scanner scan = new Scanner (System.in);
        for (int i=0;i<arr3d.length;i++){
            for (int j=0;j<arr3d[i].length;j++){
                 for(int z=0;z<arr3d[i][j].length;z++){
                     System.out.println("Please enter a name : ");
                     arr3d[i][j][z]=scan.nextLine();
                 }
            }
        }


        for (String [][] arr2d:arr3d){
            for(String [] arr1d:arr2d){
                for (String value :arr1d){
                    System.out.println(value);
                }
                System.out.println( );
            }
            System.out.println();
        }
        //declare first and then assighn values ;
        int [][] intArr1 = new int[2][3];
        intArr1[0][0]=23;
        intArr1[0][1]=12;
        intArr1[0][2]=23;
        intArr1[1][0]=5;
        intArr1[1][1]=11;
        intArr1[1][2]=3;

        int sum=0;

//        for (int i=0;i<intArr1.length;i++){
//            for (int j=0;j<intArr1[i].length;j++){
//                //sum=sum+intArr1[i][j];
//                sum+=intArr1[i][j];
//                System.out.println(sum);
//            }
//        }
//        System.out.println(sum);

        for(int[]row:intArr1){
            for(int value:row){
                System.out.print(value +" ");
            }
            System.out.println("Asel");
        }



    }



}
