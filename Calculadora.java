import java.util.Scanner;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA JAVA ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean valido = true;

        switch (operacao) {
            case '+':
                resultado = calc.somar(num1, num2);
                break;
            case '-':
                resultado = calc.subtrair(num1, num2);
                break;
            case '*':
                resultado = calc.multiplicar(num1, num2);
                break;
            case '/':
                try {
                    resultado = calc.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    valido = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}