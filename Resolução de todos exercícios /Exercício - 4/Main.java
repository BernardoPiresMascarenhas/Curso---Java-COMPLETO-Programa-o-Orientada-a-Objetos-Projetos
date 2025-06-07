import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x;

      x = sc.nextInt();

      if(x >= 1 && x <= 1000){
         for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
               System.out.println(i);
            }
         }
      }
      else{
         System.out.println("Erro!");
      }

      sc.close();
   }
}