/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Integrante {
    
    private int cod_int;
    private String desc_int;

    public Integrante() {
    }

    public Integrante(int cod_int, String desc_int) {
        this.cod_int = cod_int;
        this.desc_int = desc_int;
    }

    public int getCod_int() {
        return cod_int;
    }

    public void setCod_int(int cod_int) {
        this.cod_int = cod_int;
    }

    public String getDesc_int() {
        return desc_int;
    }

    public void setDesc_int(String desc_int) {
        this.desc_int = desc_int;
    }

    @Override
    public String toString() {
        return "Integrante{" + "cod_int=" + cod_int + ", desc_int=" + desc_int + '}';
    }
      
}