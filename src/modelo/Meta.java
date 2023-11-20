
package modelo;

/**
 *
 * @author Calderón, Solorza, Urbina
 * @version 20/11/2023
 */
public class Meta {
    
    private int cod_meta, monto_meta, cod_int;
    private String nombre_meta;

    public Meta() {
    }

    public Meta(int cod_meta, int monto_meta, int cod_int, String nombre_meta) {
        this.cod_meta = cod_meta;
        this.monto_meta = monto_meta;
        this.cod_int = cod_int;
        this.nombre_meta = nombre_meta;
    }

    public int getCod_meta() {
        return cod_meta;
    }

    public void setCod_meta(int cod_meta) {
        this.cod_meta = cod_meta;
    }

    public int getMonto_meta() {
        return monto_meta;
    }

    public void setMonto_meta(int monto_meta) {
        this.monto_meta = monto_meta;
    }

    public int getCod_int() {
        return cod_int;
    }

    public void setCod_int(int cod_int) {
        this.cod_int = cod_int;
    }

    public String getNombre_meta() {
        return nombre_meta;
    }

    public void setNombre_meta(String nombre_meta) {
        this.nombre_meta = nombre_meta;
    }

    @Override
    public String toString() {
        return "Meta{" + "cod_meta=" + cod_meta + ", monto_meta=" + monto_meta + ", cod_int=" + cod_int + ", nombre_meta=" + nombre_meta + '}';
    }
 
}
