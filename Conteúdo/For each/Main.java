import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      
      int[] array = new int[]{1, 2, 3 , 4};

      for(int i = 0; i < array.length; i++){
         System.out.println(array[i]);
      }

      System.out.println("--------------");

      for(int x : array){
         System.out.println(x);
      }

      sc.close();
   }
}
