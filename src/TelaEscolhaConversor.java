
import javax.swing.JOptionPane;

public class TelaEscolhaConversor {

    private final String[] opcoes = { "Conversor de moedas", "Conversor de temperatura" };
    private final int opcaoSelecionada;
    public TelaEscolhaConversor() {

       opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione o conversor:",
               "Conversores", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
               opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcoes[this.opcaoSelecionada];
    }
}
