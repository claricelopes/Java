import javax.swing.JOptionPane;

public class ValorDesconto {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("valor do produto: ");
        float produto = Float.parseFloat(entrada);
        entrada = JOptionPane.showInputDialog("porcentagem de desconto: ");
        float desconto = Float.parseFloat(entrada);
        float valor_desconto = produto * (desconto / 100);
        float valor_final = produto - valor_desconto;

        System.out.println("Valor do desconto oferecido: R$ " + valor_desconto);
        System.out.println("Valor com o desconto: R$" + valor_final);
    }
}