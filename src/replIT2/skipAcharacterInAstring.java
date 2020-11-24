package replIT2;

import java.util.Scanner;

public class skipAcharacterInAstring {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        word = word.replaceAll("\\s+","");
        char chr;
        //write your code below
        for (int i=0;i<=word.length()-1;i++){
            if(i%2==0){
                System.out.print(  word.charAt(i));

            }
        }
    }

}
