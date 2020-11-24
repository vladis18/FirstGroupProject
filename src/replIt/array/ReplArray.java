package replIt.array;

public class ReplArray {
    public static void main(String[] args) {

        int[] arr = { 45,78, 12,  67, 55, 89, 23, 77, 88};

        for (int i=0;i<arr.length ;i++){
            if (  i  %2==0){
                System.out.print(arr[i] + " ");
            }
           // System.out.println(arr[i] );
        }
    }
}
