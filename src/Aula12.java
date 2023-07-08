import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] idades = new int[5];
        char[] sexos = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro da pessoa " + (i + 1));

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();

            System.out.print("Sexo (M/F): ");
            sexos[i] = scanner.next().charAt(0);

            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.println();
        }

        System.out.println("Lista de usuarios:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
        }
    }
}