import java.util.Scanner;
public class verificaNumero{
     public static void main(String[] args){
       Scanner ler = new Scaner(System.in);
       int n;
       System.out.print("N: ");
       n = ler.nextInt();
        if ((n % 2) == 0)
      System.out.printf("%d é um numero \"par\". \n", n);
    if ((n % 2) == 1)
      System.out.printf("%d é um numero \"ímpar\". \n", n);
          scanner.close();
  }
}

