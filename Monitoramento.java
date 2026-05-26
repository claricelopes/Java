import java.util.Scanner;

public class Monitoramento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] t = new double[4];
        
        System.out.println("Digite as temperaturas registradas pelos quatro sensores:");
        for (int i = 0; i < 4; i++) {
            System.out.print("T" + (i + 1) + " (°C): ");
            t[i] = scanner.nextDouble();
        }
        
        double th = t[0];
        double tl = t[0];
        double tt = 0;
        
        for (int i = 0; i < 4; i++) {
            if (t[i] > th) {
                th = t[i];
            }
            if (t[i] < tl) {
                tl = t[i];
            }
            tt += t[i];
        }
        
        double tm = tt / 4.0;
        
        System.out.println("\n--- Resultados do Monitoramento ---");
        System.out.println("A temperatura mais alta (TH) é: " + th + " °C");
        System.out.println("A temperatura mais baixa (TL) é: " + tl + " °C");
        System.out.println("A média das temperaturas (TM) é: " + tm + " °C");
        System.out.println("A soma total das temperaturas (TT) é: " + tt + " °C");
        
        scanner.close();
    }
}
