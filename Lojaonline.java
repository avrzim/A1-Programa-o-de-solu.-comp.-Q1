import java.util.Scanner;

public class Lojaonline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço da Blusa: R$ ");
        double precoBlusa = scanner.nextDouble();

        System.out.print("Digite o preço do Short: R$ ");
        double precoShort = scanner.nextDouble();

        System.out.print("Digite a quantidade de Blusas: ");
        int quantidadeBlusas = scanner.nextInt();

        System.out.print("Digite a quantidade de Shorts: ");
        int quantidadeShorts = scanner.nextInt();

        double desconto = 0;
        int quantidadeTotal = quantidadeBlusas + quantidadeShorts;
        if (quantidadeTotal > 5) {
            desconto = 0.1;
        }

        double valorTotal = (precoBlusa * quantidadeBlusas) + (precoShort * quantidadeShorts);
        double valorComDesconto = valorTotal * (1 - desconto);

        System.out.println("Valor total da compra com desconto: R$" + valorComDesconto);

        scanner.close();
    }
}