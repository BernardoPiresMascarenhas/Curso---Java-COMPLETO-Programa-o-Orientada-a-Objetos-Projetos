import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double dollarPrice;
      double dollarQuant;

      
      dollarPrice = sc.nextDouble();
      dollarQuant = sc.nextDouble();

      CurrencyConverter cotacao = new CurrencyConverter(dollarPrice, dollarQuant);
      
      System.out.println("What is the dollar price?" + cotacao.getDollarPrice());
      System.out.println("How many dollars will be bought?" + cotacao.getDollarQuant());
      System.out.println("Amount to be paid in reais = " + cotacao.calcularValorReal());
      


      sc.close();
   }
}

class CurrencyConverter{

   private double dollarPrice;
   private double dollarQuant;
   private double IOF = 0.06;

   public CurrencyConverter(double dollarPrice, double dollarQuant){
      this.dollarPrice = dollarPrice;
      this.dollarQuant = dollarQuant;
   }

   public void setDollarPrice(double dollarPrice){
      this.dollarPrice = dollarPrice;
   }

   public double getDollarPrice(){
      return this.dollarPrice;
   }
   
   public void setDollarQuant(double dollarQuant){
      this.dollarQuant = dollarQuant;
   }

   public double getDollarQuant(){
      return this.dollarQuant;
   }

   public double calcularValorReal(){
      
      double IOF = (this.dollarPrice * this.IOF) * this.dollarQuant;
      double valorReais = (this.dollarPrice * this.dollarQuant) + IOF;

      return valorReais;
   }
}