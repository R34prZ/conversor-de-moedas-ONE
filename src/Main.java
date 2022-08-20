import java.util.Objects;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        do {
            try {
                TelaEscolhaConversor telaEscolhaConversor = new TelaEscolhaConversor();
                TelaEscolhaValor telaEscolhaValor = new TelaEscolhaValor();

                double valorSelecionado = telaEscolhaValor.getValor();

                if (Objects.equals(telaEscolhaConversor.getOpcaoSelecionada(), "Conversor de moedas")) {
                    TelaEscolhaMoedas telaEscolhaMoedas = new TelaEscolhaMoedas();
                    new TelaResultadoConversaoMoedas(valorSelecionado, telaEscolhaMoedas.getOpcaoSelecionada());
                } else {
                    TelaEscolhaTemperaturas telaEscolhaTemperaturas = new TelaEscolhaTemperaturas();
                    new TelaResultadoConversaoTemperatura(valorSelecionado, telaEscolhaTemperaturas.getOpcaoSelecionada());
                }
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                new TelaErro("Valor informado é inválido!");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                new TelaErro("Ocorreu um problema...");
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado!");

        System.exit(0);
    }
}
