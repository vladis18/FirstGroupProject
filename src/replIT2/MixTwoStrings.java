package replIT2;

public class MixTwoStrings {
    public static void main(String[] args) {
        String str1="Hello";
        String str2 = "12345";
        String newS="";
        char[] chr= str1.toCharArray();
        char [] chr2 = str2.toCharArray();
        for (int i =0;i<chr.length;i++){

            for (int j = 0; j<chr2.length;j++){
                if(i==j) {
                    newS = newS + chr[i] + chr2[j];
                }
                continue;
            }
        }
        System.out.print(newS);
    }
}
