/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo3;

/**
 *
 * @author Mario Santos
 */
public class TareaModulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Carro carro = new Carro();
        
        carro.setMarca("Audi");
        carro.setModelo("A5");
        carro.setColor("Gris");
        carro.setAño(2019);

        System.out.println("Marca: " + carro.getMarca() );
        System.out.println("Modelo: " + carro.getModelo() );
        System.out.println("Color: " + carro.getColor() );
        System.out.println("Año: " + carro.getAño() );
        
    }
    
}
