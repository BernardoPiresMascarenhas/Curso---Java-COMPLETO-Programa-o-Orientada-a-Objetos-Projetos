import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num;
      num = sc.nextInt();

      if(num < 0){
         System.out.println("NEGATIVO");
      }else{
         System.out.println("NÃO NEGATIVO");
      }
      
      sc.close();
   }
}
