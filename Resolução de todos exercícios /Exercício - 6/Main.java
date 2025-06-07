import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int numberCont;
      String name;
      char resp;
      double deposit;
      double saque;

      Banco conta = new Banco();

      System.out.print("Enter account number: ");
      numberCont = sc.nextInt();
      conta.setNumberCont(numberCont);
      sc.nextLine();

      System.out.print("Enter account holder: ");
      name = sc.nextLine();
      conta.setName(name);
      
      System.out.print("Is there na initial deposit (y/n)? ");
      resp = sc.next().charAt(0);
      
      if(resp == 'y'){
         System.out.print("Enter initial deposit value: ");
         deposit = sc.nextDouble();
         conta.Depositar(deposit);

         System.out.println();

         System.out.println("Account data:");     
         System.out.println("Account " + conta.getNumberCont() + ", Holder: " + conta.getName() + ", Balance: $ " + conta.getSaldo());

         System.out.println();
         
         System.out.print("Enter a deposit value: ");
         deposit = sc.nextDouble();
         conta.Depositar(deposit);
         
         System.out.println("Updated account data:"); 
         System.out.println("Account " + conta.getNumberCont() + ", Holder: " + conta.getName() + ", Balance: $ " + conta.getSaldo());

         System.out.println();
         
         System.out.print("Enter a withdraw value: ");
         saque = sc.nextDouble();
         conta.Sacar(saque); 
         
         System.out.println("Updated account data:"); 
         System.out.println("Account " + conta.getNumberCont() + ", Holder: " + conta.getName() + ", Balance: $ " + conta.getSaldo());

         System.out.println();

      }
      else{
         System.out.print("Account data:");     
         System.out.print("Account " + conta.getNumberCont() + ", Holder: " + conta.getName() + ", Balance: $ " + conta.getSaldo());

         System.out.println();
      }

      sc.close();
   }
   
}

class Banco{
   private double saldo = 0;
   private String name;
   private int numberCont;
   private double saque;

   public Banco(double saldo, String name, int numberCont){
      this.saldo= saldo;
      this.name = name;
      this.numberCont = numberCont;
   }

   public Banco(){

   }

   public void setSaldo(double saldo){
      this.saldo = saldo;
   }

   public double getSaldo(){
      return this.saldo;
   }

   public void setName(String name){
      this.name = name;
   }

   public String getName(){
      return this.name;
   }

   public void setNumberCont(int numberCont){
      this.numberCont = numberCont;
   }

   public int getNumberCont(){
      return this.numberCont;
   }

   public void setSaque(double saque){
      this.saque = saque;
   }

   public double getSaque(){
      return this.saque;
   }

   public void Depositar(double deposit){
      this.saldo = saldo + deposit;
   }

   public void Sacar(double saque){
      this.saldo = (saldo - saque) - 5;
   }
}