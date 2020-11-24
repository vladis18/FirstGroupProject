package replIt.array;

class Main {
    static int sumEvenToX (int[] num1 ) {
        int sum = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] % 2 == 0) {
                sum += num1[i];
            }


        }
        return sum;
    }

    public static void main(String[] args) {


        int[] num2={2,3,4,5};
        int X= sumEvenToX(num2);
        System.out.println(X);
    }
}