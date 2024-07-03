import java.util.Scanner;

public class Bhaskara {
    public  static double a, b, c, delta, x1, x2, raiz_quadrada;
    @SuppressWarnings({"resource" })
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o valor de a:");
        a = ler.nextDouble();
        System.out.println("Qual o valor de b:");
        b = ler.nextDouble();
        System.out.println("Qual o valor de c:");
        c = ler.nextDouble();

        delta = (b * b) - (4 * a * c);
        
        raiz_quadrada = Math.sqrt(delta);

        if (delta <= 0 || a == 0) {
            System.out.println("Impossível continuar a expressão");
        }else {
            x1 = (-b + raiz_quadrada) / (2 * a);
            x2 = (-b - raiz_quadrada) / (2 * a);
            System.out.println("O resltado de x uma linha é: " + x1);
            System.out.println("O resltado de x duas linha é: " + x2);
        }
    }
}