import java.util.Scanner;

class SequenciaFibonacci {

    // Função que verifica se o número pertence à sequência de Fibonacci
    public static boolean Fibonacci(int n) {
        int a = 0;
        int b = 1;

        // Se o número é 0 ou 1, ele pertence à sequência
        if (n == a || n == b) {
            return true;
        }

        int c = a + b;
        // Continua a somar até que o próximo número seja maior que n
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário ou define um valor previamente
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (Fibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
