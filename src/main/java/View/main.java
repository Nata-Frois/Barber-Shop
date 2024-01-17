/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author User
 */
public class main {
    
    
    public static void main(String[] args){
        
        
        String nome = "thiago";
        System.out.println(nome);
        
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
         System.out.println(servico.getValor());
        
         
         Cliente cliente = new Cliente(1, "thiago", 'M', "19-97234-7865", "rua showshow 1050");
         System.out.println(cliente);
         
         
         Usuario usuario = new Usuario(1, "barbeiro", "senha");
                 System.out.println(usuario);
                 
        
    }
    
}
