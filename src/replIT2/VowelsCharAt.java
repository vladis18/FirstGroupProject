package replIT2;
import java.util.Scanner;
public class VowelsCharAt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int i=0;i<word.length();i++){
            word=word.toLowerCase();
            if( word.charAt(i)=='a'|| word.charAt(i)=='o' ||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='u'){
                System.out.print(word.charAt(i));
            }
        }
    }


}
