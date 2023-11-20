
package modelo;

import java.util.Date;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class Ahorro {
    
    private int cod_ahorro, cod_meta, monto_ahorro;
    private String desc_meta;
    private Date fecha_ahorro;

    public Ahorro() {
    }

    public Ahorro(int cod_ahorro, int cod_meta, int monto_ahorro, String desc_meta, Date fecha_ahorro) {
        this.cod_ahorro = cod_ahorro;
        this.cod_meta = cod_meta;
        this.monto_ahorro = monto_ahorro;
        this.desc_meta = desc_meta;
        this.fecha_ahorro = fecha_ahorro;
    }

    public int getCod_ahorro() {
        return cod_ahorro;
    }

    public void setCod_ahorro(int cod_ahorro) {
        this.cod_ahorro = cod_ahorro;
    }

    public int getCod_meta() {
        return cod_meta;
    }

    public void setCod_meta(int cod_meta) {
        this.cod_meta = cod_meta;
    }

    public int getMonto_ahorro() {
        return monto_ahorro;
    }

    public void setMonto_ahorro(int monto_ahorro) {
        this.monto_ahorro = monto_ahorro;
    }

    public String getDesc_meta() {
        return desc_meta;
    }

    public void setDesc_meta(String desc_meta) {
        this.desc_meta = desc_meta;
    }

    public Date getFecha_ahorro() {
        return fecha_ahorro;
    }

    public void setFecha_ahorro(Date fecha_ahorro) {
        this.fecha_ahorro = fecha_ahorro;
    }

    @Override
    public String toString() {
        return "Ahorro{" + "cod_ahorro=" + cod_ahorro + ", cod_meta=" + cod_meta + ", monto_ahorro=" + monto_ahorro + ", desc_meta=" + desc_meta + ", fecha_ahorro=" + fecha_ahorro + '}';
    }

}

