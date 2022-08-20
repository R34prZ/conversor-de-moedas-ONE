import javax.swing.JOptionPane;

public class TelaEscolhaValor {

    private final String valor;
    public TelaEscolhaValor() {
        valor = JOptionPane.showInputDialog(null, "Insira um valor: ");
    }

    public double getValor() throws NumberFormatException {
        return Double.parseDouble(this.valor);
    }
}
