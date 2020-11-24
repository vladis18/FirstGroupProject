package replIT2;

import javax.crypto.spec.PSource;

class X {
    public  void calc (){
        int x =1;
        System.out.println(x);
    }


}
  class Y extends X {
    public  void calc(int b){
        int i =7 +b;
        System.out.println(i);
    }


    public static void main(String[] args) {
   Y  y = new Y();
    X x = new Y();
x.calc();
y.calc(5);
    }}
