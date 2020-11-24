package replIT2;


import java.util.Scanner;

public class CharAtReverseAString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("In:");
        String s = inp.nextLine();
        char myChar;
        String str="";
        //write your code below
        for (int i=s.length()-1;i>=0;i--){
            myChar=s.charAt(i);
            str+=myChar;

        }
        System.out.println(str);
    }
}

