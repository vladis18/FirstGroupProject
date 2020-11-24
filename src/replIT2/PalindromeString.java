package replIT2;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean polindrome=false;
        System.out.print("In:");
        String givenString = inp.nextLine();
        givenString=givenString.replaceAll("\\s", "");
        //write your code below
        String str1 = "", str2 = "";
        for (int i = 0; i < givenString.length(); i++) {

            str1 += givenString.charAt(i);
        }
            for (int j = givenString.length()-1; j  >= 0; j--) {
                str2 += givenString.charAt(j);
            }

if (str1.equalsIgnoreCase(str2)){
    polindrome=true;
    System.out.println(polindrome);
    System.out.println(str2 + " is a palindrome string");
}
else System.out.println(polindrome);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}


