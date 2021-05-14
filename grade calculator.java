import java.util.Scanner;
  public class MyClass {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("hello what is your naem");
       String naem = scan.nextLine();// patchnote made this use scanner class so it does not need to be edited
       int again = 1;
       while (again < 2){
          
       System.out.println("Hello " + naem + " Please Enter what you got below");
         float pointsEarned = scan.nextFloat();
       System.out.println(naem + ", Please Enter what the points it was out of");
        float totalPoints = scan.nextFloat();
        System.out.println(naem + ", Thanks will take a second to process");
        if (pointsEarned > totalPoints){
            throw new SecurityException(naem + ", Thats an impossible grade rerun code and input it right");
        }
            float grade = pointsEarned / totalPoints;
        System.out.println(naem + ", you grade is " + grade);
        System.out.println(naem + ", if you would like to continue enter 2 if not enter 1");
        int commence = scan.nextInt();
        if (commence == 2) {
          if (grade > 0.80) {
            System.out.println("congrats, " + naem + ", you got an A");
          }
        else if (grade < 0.70) {
          System.out.println(naem + ", you failed and will be homeless acording to my dad");
          }
        }
        else {
            throw new SecurityException("thanks for using me " + naem);
        }
      }
    }
  }