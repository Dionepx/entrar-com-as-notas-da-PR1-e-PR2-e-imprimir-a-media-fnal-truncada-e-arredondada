import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double PR1 = sc.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double PR2 = sc.nextDouble();

        double media = (PR1 + PR2) / 2;
        int mediaTruncada = (int) media;
        double mediaArredondada = Math.round(media);

        System.out.println("Média: " + media);
        System.out.println("Média truncada: " + mediaTruncada);
        System.out.println("Média arredondada: " + mediaArredondada);

    }
}