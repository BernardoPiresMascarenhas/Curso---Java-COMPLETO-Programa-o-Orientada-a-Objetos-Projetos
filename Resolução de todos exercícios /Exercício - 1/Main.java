import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num1, num2; 
      int soma = 0;

      num1 = sc.nextInt();
      num2 = sc.nextInt();

      soma = num1 + num2;

      System.out.println("SOMA = " + soma);
      
      sc.close();
   }
}