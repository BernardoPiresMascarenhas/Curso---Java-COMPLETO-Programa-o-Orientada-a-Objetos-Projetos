import java.util.*;

public class Main {
   public static void main(String[] args) {
      

      List<String> lista = new ArrayList<>();

      lista.add("Bernardo");
      lista.add("Luna");
      lista.add("Gabriel");
      lista.add(2, "Lucas");
      
      
      lista.remove("Gabriel");

      lista.remove(0);
      
      for(String nome : lista){
         System.out.println(nome);
      }

      //tamanho da lista 
      System.out.println(lista.size());
 
   }
}
