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
public class Carro {
    
    private String marca;
    private String modelo;
    private String color;
    private int año;   

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public int getAño(){
        return año;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setAño(int año){
        this.año = año;
    }
}
