package replIt.array;

public class EveryThirdLetter {
    public static void main(String[] args) {
        String str ="hello there";
        for (int i=0;i< str.length();i++){
            if (i==0|| i<str.length()) {
                System.out.print(str.charAt(i));
                i=i+2;
            }
        }


    }
}
