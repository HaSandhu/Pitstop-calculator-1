
import java.util.Scanner;
class lapCalc{
     public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     System.out.print("How many Laps?:  ");
     int num = obj.nextInt();
     
     System.out.println();
     
     System.out.print("Time est per lap?: ");
     double time = obj.nextDouble();
     
     double ret = 0;
     
     for (int i = 1; i <= num; i++) {
         ret += i*time;
     }
     
     System.out.println();

     System.out.print("This is how much time you will lose:  " + ret);
     
     }
}