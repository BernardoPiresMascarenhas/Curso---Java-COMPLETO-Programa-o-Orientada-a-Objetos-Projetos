import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] array = new int[4];
      int senha = 2002;

      for (int i = 0; i < array.length; i++) {
         array[i] = sc.nextInt();
      }

      for(int i = 0; i < array.length; i++) {
         if(array[i] == senha){
            System.out.println("Acesso Permitido");
         } else {
            System.out.println("Senha Invalida");  
         }
      }

      sc.close();
   }
}
