package exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo do cliente (F ou M): ");
        String sexo = sc.nextLine();

        System.out.print("Digite a quantidade de cervejas consumidas: ");
        int qtdCervejas = sc.nextInt();

        System.out.print("Digite a quantidade de refrigerantes consumidos: ");
        int qtdRefrigerantes = sc.nextInt();

        System.out.print("Digite a quantidade de espetinhos consumidos: ");
        int qtdEspetinhos = sc.nextInt();

        Cliente cliente = new Cliente(sexo, qtdCervejas, qtdRefrigerantes, qtdEspetinhos);
        Bar bar = new Bar();

        bar.gerarRelatorio(cliente);

        sc.close();
    }
}
