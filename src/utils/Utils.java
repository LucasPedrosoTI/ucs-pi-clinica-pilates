package utils;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Utils {

  public static Double paraDuasCasasDecimais(Double num) {

    Double numXCem = num * 100.0;

    return numXCem.longValue() / 100.0;
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
      campoVazio = campo.getText().trim().length() <= 0;
    }

    return campoVazio;
  }

  public static void toggleButton(JButton botao) {
    botao.setEnabled(!botao.isEnabled());
  }

}
