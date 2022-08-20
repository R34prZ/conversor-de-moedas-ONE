import javax.swing.JOptionPane;

public class TelaResultadoConversaoTemperatura extends Conversor {

    public TelaResultadoConversaoTemperatura(double valor, String op) {
        converter(valor, op);
        String msg = String.format("O valor convertido foi %.2f %s", super.valorConvertido, super.simboloConversao);
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {
        switch (op) {
            case "De Celsius para Fahrenheit" -> {
                super.simboloConversao = "°F";
                super.valorConvertido = (valor * (9.0 / 5.0)) + 32;
            }
            case "De Fahrenheit para Celsius" -> {
                super.simboloConversao = "°C";
                super.valorConvertido = (valor - 32) * (5.0 / 9.0);
            }
            case "De Celsius para Kelvin" -> {
                super.simboloConversao = "K";
                super.valorConvertido = valor + 273.15;
            }
            case "De Kelvin para Celsius" -> {
                super.simboloConversao = "°C";
                super.valorConvertido = valor - 273.15;
            }
        }
    }
}
