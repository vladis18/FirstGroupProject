package ReviewClassArray;

public class SumArray {

    double sumA(double [] array){
        double sum=0;
//        for (int i =0;i<array.length;i++){
//            sum=sum+array[i];
//
//        }
        for (double v:array){
            sum+=v;
        }

        return sum;
    }
}
