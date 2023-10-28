/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3_catalogo;

import java.util.List;

/**
 *
 * @author cristhian.cisneros
 */
public class Ropa {

    private String nombre;
    private String codigo;
    private int precio;
    private List<Ropa> ropas;
    
    public Ropa(String nombre, String codigo, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String getTextoLista(){
        return this.nombre+ ", "
                + this.codigo + " "
                + " |PRECIO: " + this.precio;
    }
    
    public String getTexto(){
        return this.nombre+ "    |    " + this.codigo + "    |     S/" + this.precio;
    }
    
    public void agregarRopa(Ropa ropa){
        if(this.ropas!=null &&
                this.ropas.size()>=0){
            ropas.add(ropa);
        }
    }
}
