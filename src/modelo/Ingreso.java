
package modelo;

import java.util.Date;

/**
 *
 * @author michimisimo
 */
public class Ingreso {
    
    private int cod_ing, monto_ing,cod_int;
    private String desc_ing;
    private Date fecha_ing;

    public Ingreso() {
    }

    public Ingreso(int cod_ing, int monto_ing, int cod_int, String desc_ing, Date fecha_ing) {
        this.cod_ing = cod_ing;
        this.monto_ing = monto_ing;
        this.cod_int = cod_int;
        this.desc_ing = desc_ing;
        this.fecha_ing = fecha_ing;
    }

    public int getCod_ing() {
        return cod_ing;
    }

    public void setCod_ing(int cod_ing) {
        this.cod_ing = cod_ing;
    }

    public int getMonto_ing() {
        return monto_ing;
    }

    public void setMonto_ing(int monto_ing) {
        this.monto_ing = monto_ing;
    }

    public int getCod_int() {
        return cod_int;
    }

    public void setCod_int(int cod_int) {
        this.cod_int = cod_int;
    }

    public String getDesc_ing() {
        return desc_ing;
    }

    public void setDesc_ing(String desc_ing) {
        this.desc_ing = desc_ing;
    }

    public Date getFecha_ing() {
        return fecha_ing;
    }

    public void setFecha_ing(Date fecha_ing) {
        this.fecha_ing = fecha_ing;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "cod_ing=" + cod_ing + ", monto_ing=" + monto_ing + ", cod_int=" + cod_int + ", desc_ing=" + desc_ing + ", fecha_ing=" + fecha_ing + '}';
    }
    
}
