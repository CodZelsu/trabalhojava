import java.util.scanner;
public class MaiorNumero{

    public static void main (Strig [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        Math.max(num1, num2, num3);
        double resultado = scanner.nextdouble();

        System.out.println ("O maior numero é:"+ resultado);

        scanner.close()

    }

}