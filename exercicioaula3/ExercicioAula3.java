/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula3;
import javax.swing.JOptionPane;
/**
 *
 * @author Cliente
 */
public class ExercicioAula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome, years;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null,"Seja bem-vindo "+nome);
        years = JOptionPane.showInputDialog(null,"Qual a sua Idade?");
        
        int idade = Integer.parseInt(years);
        if(idade>=18){
            JOptionPane.showMessageDialog(null,"Você já pode tirar sua CNH");
            
        } else{
            JOptionPane.showMessageDialog(null, "Você não pode tirar a CNH.", null, JOptionPane.ERROR_MESSAGE);
            
            
        }
        
    }
    
}
