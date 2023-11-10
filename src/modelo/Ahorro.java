
package modelo;

import java.util.Date;

/**
 *
 * @author michimisimo
 */
public class Ahorro {
    
    private int cod_ahorro, cod_meta, monto_ahorro;
    private Date fecha_ahorro;

    public Ahorro() {
    }

    public Ahorro(int cod_ahorro, int cod_meta, int monto_ahorro, Date fecha_ahorro) {
        this.cod_ahorro = cod_ahorro;
        this.cod_meta = cod_meta;
        this.monto_ahorro = monto_ahorro;
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

    public Date getFecha_ahorro() {
        return fecha_ahorro;
    }

    public void setFecha_ahorro(Date fecha_ahorro) {
        this.fecha_ahorro = fecha_ahorro;
    }

    @Override
    public String toString() {
        return "Ahorro{" + "cod_ahorro=" + cod_ahorro + ", cod_meta=" + cod_meta + ", monto_ahorro=" + monto_ahorro + ", fecha_ahorro=" + fecha_ahorro + '}';
    }

}

