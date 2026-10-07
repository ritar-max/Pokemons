import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("1- Chikorita");
        System.out.println("2- Cyndaquil");
        System.out.println("3- Totodile");

        System.out.print("Digite o numero correspondente a sua escolha: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1- Chikorita, pokemon de grama, forte contra o tipo agua e fraco contra o tipo fogo, boa sorte treinador/a!");
                break;

            case 2:
                System.out.println("2- Cyndaquil, pokemon de fogo, forte contra o tipo grama e fraco contra o tipo agua, boa sorte treinador/a!");
                break;

            case 3:
                System.out.println("3- Totodile, pokemon de agua, forte contra o tipo fogo e fraco contra o tipo grama, boa sorte treinador/a!");
                break;

            default:
                System.out.println("Opcao invalida! Por favor, escolha um numero entre 1 e 3.");
                break;
        }

        scanner.close();
    }
}