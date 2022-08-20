import javax.swing.JOptionPane;

public class TelaResultadoConversaoMoedas extends Conversor {

    public TelaResultadoConversaoMoedas(double valor, String op) {
        converter(valor, op);

        String msg = String.format("O valor convertido foi %s %.2f", super.simboloConversao, super.valorConvertido);

        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {

        // OBS: Valores para conversão obtidos do google no dia 19/08/22

        switch (op) {
            case "De Reais a Dólares" -> {
                super.simboloConversao = "U$";
                super.valorConvertido = valor / 5.20;
            }
            case "De Reais a Euros" -> {
                super.simboloConversao = "€";
                super.valorConvertido = valor / 5.21;
            }
            case "De Reais a Libras Esterlinas" -> {
                super.simboloConversao = "£";
                super.valorConvertido = valor / 6.14;
            }
            case "De Reais a Peso Argentino" -> {
                super.simboloConversao = "$";
                super.valorConvertido = valor / 0.038;
            }
            case "De Reais a Peso Chileno" -> {
                super.simboloConversao = "CLP";
                super.valorConvertido = valor / 0.0055;
            }
            case "De Dólares a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.20;
            }
            case "De Euros a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.21;
            }
            case "De Libras Esterlinas a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 6.14;
            }
            case "De Peso Argentino a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.038;
            }
            case "De Peso Chileno a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.0055;
            }
        }
    }
}