package utils;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Utils {

  public static Double paraDuasCasasDecimais(Double num) {

    Double numXCem = num * 100;

    return Double.valueOf(numXCem.longValue() / 100);
  }

  public static void limparCampos(List<JTextField> campos) {
    for (JTextField campo : campos) {
      campo.setText("");
    }
  }

  public static void desabilitarCampos(List<JTextField> campos) {
    for (JTextField campo : campos) {
      campo.setEnabled(false);
    }
  }

  public static void desabilitarBotoes(List<JButton> botoes) {
    for (JButton botao : botoes) {
      botao.setEnabled(false);
    }
  }

  public static boolean tiverCamposNaoPreenchidos(List<JTextField> campos) {
    boolean campoVazio = false;
    for (JTextField campo : campos) {
      campoVazio = campo.getText().length() <= 0;
    }

    return campoVazio;
  }

}
