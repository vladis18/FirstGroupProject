package class18;

public class AccessModifiers {
//    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
//    Method should be visibly only within same package and accessible
//    by the creating an instance of the class.
    int arrayParam(int [] elements){
        int sum=0;
        for (int i=0;i<elements.length;i++){
            sum+=elements[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        AccessModifiers aM=new AccessModifiers();
        int[] ellements=new int[4];
        ellements[0]=2;
        ellements[1]=3;
        ellements[2]=1;
        ellements[3]=4;
       int sum= aM.arrayParam(ellements);
    }
}
