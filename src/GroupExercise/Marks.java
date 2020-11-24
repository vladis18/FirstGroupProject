package GroupExercise;
//We have to calculate the average of marks obtained in three subjects by student A and by student B.
//Create class'Marks'with an abstract method'getPercentage'that will be returning the average percentage of marks.
//Provide implementation of abstract method in classes'A'and'B'.The constructor of student A takes the
//marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
//        Test your code.
public abstract class Marks {
    public abstract int getPercentage();
}
   class StudentA extends Marks{
    int subj1,subj2,subj3;

        StudentA(int subj1,int subj2, int subj3){
            this.subj1=subj1;
            this.subj2=subj2;
            this.subj3=subj3;
        }

       @Override
       public int getPercentage() {
       return (this.subj1+this.subj2 +this.subj3)/3;

       }
   }
  class StudentB extends Marks{
      int subj1,subj2,subj3,subj4;
      StudentB(int subj1,int subj2,int subj3,int subj4){
          this.subj1=subj1;
          this.subj2=subj2;
          this.subj3=subj3;
          this.subj4=subj4;

      }
      @Override
      public int getPercentage() {
           return (this.subj1+this.subj2 +this.subj3 + this.subj4) /4;
      }


  }
class main{
    public static void main(String[] args) {
        StudentA stA=new StudentA(70,80,90);
        System.out.println("Average for student A is " +stA.getPercentage());
        StudentB stB = new StudentB( 95,79,85,90);
        System.out.println("Average for student B is " +stB.getPercentage());

    }

}