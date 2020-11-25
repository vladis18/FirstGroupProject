package GroupExercise;

class Main {


    static int countA(String s){

        //String someString = "elephant";
        char someChar = 'a';
        int count = 0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                count++;
            }
        }
//assertEquals(2, count);
        return count;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }


}

