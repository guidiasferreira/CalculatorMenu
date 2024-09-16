/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menucalculator;
import javax.swing.JOptionPane;

public class MenuCalculator {
    public static void main(String[] args) {
        
        double v1, v2, resultado = 0;
        int v3, op = 0;

        

        do {
            String mensagem = "";
            
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(" 1 - Soma\n" + " 2 - Subtrair\n" + " 3 - Multiplicar\n" + " 4 - Dividir\n" + " 5 - Tabuada\n" + " 0 - Sair\n "));

            if (op != 0) {
                if (op == 5) {
                    v3 = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o valor para tabuada: "));

                    for (int cont = 1; cont <= 10; cont++) {
                        resultado = v3 * cont;
                        mensagem += v3 + " X " + cont + " = " + v3 * cont + "\n";

                    }

                } else {

                    v1 = Double.parseDouble(
                            JOptionPane.showInputDialog("Digite o valor 1: "));

                    v2 = Double.parseDouble(
                            JOptionPane.showInputDialog("Digite o valor 2: "));

                    if (op == 1) {
                        resultado = (v1 + v2);
                        mensagem = "A soma = " + resultado;

                    } else {
                        if (op == 2) {
                            resultado = (v1 - v2);
                            mensagem = "A subtração = " + resultado;

                        } else {
                            if (op == 3) {
                                resultado = (v1 * v2);
                                mensagem = "A multiplicação = " + resultado;

                            } else {
                                if (op == 4) {
                                    resultado = (v1 / v2);
                                    mensagem = "A divisão = " + resultado;
                                }
                            }
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, mensagem);

            } else {
                JOptionPane.showMessageDialog(null, "Program Close");
            }

        } while (op != 0);
    }
}
