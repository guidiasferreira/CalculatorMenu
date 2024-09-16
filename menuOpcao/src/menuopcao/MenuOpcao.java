/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuopcao;
import javax.swing.JOptionPane;

public class MenuOpcao {
    public static void main(String[] args) {

        int senha = 123, senha_tentativa, tentativas = 3;

        do {
            senha_tentativa = Integer.parseInt(
                    JOptionPane.showInputDialog("Você possui 3 tentativas para a senha: "));

            tentativas--;
            
        } while (tentativas != 0 && senha_tentativa != senha);
        
        if (senha_tentativa == senha) {
            JOptionPane.showMessageDialog(null, "Senha correta!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas, atingido!");
        }
    }
}
