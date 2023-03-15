package Pacote;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Restaurante {

    public static void main(String[] args) {
        Integer a = Integer.parseInt(JOptionPane.showInputDialog("1.Hambúrguer, 2.Pizza, 3.Sair"));
        Hambúrguer ham = new Hambúrguer();
        Pizza pizza = new Pizza();
        if(a == 1){
            String h1 = (JOptionPane.showInputDialog("Nome: "));
            Double h2 = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
            Boolean h3 = Boolean.parseBoolean(JOptionPane.showInputDialog("Artesanal"));

            ham.nome(h1);
            ham.valor(h2);
            ham.seArtesanal(h3);

        }

        else if (a == 2){
            String h1 = (JOptionPane.showInputDialog("Nome: "));
            Double h2 = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
            Boolean h3 = Boolean.parseBoolean(JOptionPane.showInputDialog("Artesanal"));

            pizza.nome(h1);
            pizza.CalculaValor(h2);
            pizza.SeBorda(h3);

        }
        else if(a == 3){
            JOptionPane.showMessageDialog(null, "Fim" );

        }
        JOptionPane.showMessageDialog(null, "Teste");
    }
}
