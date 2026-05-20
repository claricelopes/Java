import java.util.Scanner;

public class Brasileirao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Pontos do lider: ");
        int pontos_lider = leitor.nextInt();

        System.out.println("Pontos do laterna: ");
        int pontos_lanterna = leitor.nextInt();

        leitor.close();

        int vitorias = (pontos_lider - pontos_lanterna) / 3;
        System.out.println("Jogos para alcançar o lider: " + vitorias);
    }
}
