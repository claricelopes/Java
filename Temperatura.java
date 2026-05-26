import javax.swing.JOptionPane;

public class Temperatura {
    public static void main(String[] args) {
        String resposta = "s";
        while (resposta.equals("s")) {
            String entrada = JOptionPane.showInputDialog("Digite a temperatura em Celsius: ");
            float celsius = Float.parseFloat(entrada);
            float fahrenheit = (celsius * 9 / 5) + 32;
            JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
            resposta = JOptionPane.showInputDialog("Deseja continuar? (s/n)");
        }
    }
}
