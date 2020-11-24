package replIT2;
import java.util.Scanner;
public class ArraySubString {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            //leave above alone!  write your code below
            for (int i=0;i<arr.length;i++){
                arr[i]=input.next();
            }
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[j].substring(0,3));
            }
        }
    }


