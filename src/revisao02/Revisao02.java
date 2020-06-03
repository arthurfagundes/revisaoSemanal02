/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Fagundes
 */
public class Revisao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* A granja Frangotech possui um controle automatizado de cada frango 
        da sua produção. No pé direito do frango há um anel com um chip de 
        identificação; no pé esquerdo são dois anéis para indicar o 
        tipo de alimento que ele deve consumir. Sabendo que o 
        anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um 
        algoritmo para calcular o gasto total da granja para marcar todos os 
        seus frangos. Ao término insira na resposta o link do github com o 
        seu repositório criado */
        
        DecimalFormat f = new DecimalFormat ("0.00");
        double chipID, chipFood, total;
        chipID=4.00;
        chipFood=3.5*2;
        int qtdadeFrango=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de frangos da granja: "));
        total=qtdadeFrango*(chipID+chipFood);
        JOptionPane.showMessageDialog(null, "O gasto total da granja será de R$" +f.format(total));
    }
    
}
