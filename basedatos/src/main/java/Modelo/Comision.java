/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author barah
 */
public class Comision {
    private int num;
    private int IDvendedor;
    private String nomvendedor;
    private int Enero;                  //aqui colocamos las propiedades de la tabla
    private int Febrero;
    private int Marzo;
    private int Abril;
    private int Mayo;
    private int Junio;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIDvendedor() {
        return IDvendedor;
    }

    public void setIDvendedor(int IDvendedor) {
        this.IDvendedor = IDvendedor;
    }

    public String getNomvendedor() {
        return nomvendedor;                               //Se realizó un insertado de codigo de Getter y Setters función es permitir el obtener el valor de una propiedad 
    }                                                     //de la clase y así poder utilizar dicho valor en diferentes métodos.
    public void setNomvendedor(String nomvendedor) {      // asi tenemos el modelo de la tabla comisiones
        this.nomvendedor = nomvendedor;
    }

    public int getEnero() {
        return Enero;
    }

    public void setEnero(int Enero) {
        this.Enero = Enero;
    }

    public int getFebrero() {
        return Febrero;
    }

    public void setFebrero(int Febrero) {
        this.Febrero = Febrero;
    }

    public int getMarzo() {
        return Marzo;
    }

    public void setMarzo(int Marzo) {
        this.Marzo = Marzo;
    }

    public int getAbril() {
        return Abril;
    }

    public void setAbril(int Abril) {
        this.Abril = Abril;
    }

    public int getMayo() {
        return Mayo;
    }

    public void setMayo(int Mayo) {
        this.Mayo = Mayo;
    }

    public int getJunio() {
        return Junio;
    }

    public void setJunio(int Junio) {
        this.Junio = Junio;
    }
    
}
