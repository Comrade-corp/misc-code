//this program is a calculator
//copyright© Comrade Alyx
//circa 2021
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
    System.out.println("mode is below type numbers and hit enter");
    System.out.println("1 = add 2 = minus 3 = multiply 4 = divide");
    int mode = scan.nextFloat();
   System.out.println("fIrSt NuMbEr");
        float x = scan.nextInt();
    System.out.println("SEcoNd NUmbEr");
        float y = scan.nextFloat();
    if (mode > 5) {
                throw new ArithmeticException("stahp");
            }
   switch (mode) {
     case 1:
        System.out.println(x + y);
         break;
     case 2:
      
       if (x < y) {
           throw new ArithmeticException("NeGaTiVe NUmBeRs DoN'T ExIsT");
           
       }
       else if (x > y) {
                System.out.println(x - y);
           }
           break;
    case 3:
        System.out.println(x * y);
        break;
        case 4:
            System.out.println(x / y);
        break;
        case 5:
            throw new ArithmeticException("the 5th case is a lie");
        
   }
    }
}