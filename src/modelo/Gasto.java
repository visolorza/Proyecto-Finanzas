package modelo;

import java.util.Date;

/**
 *
 * @author michimisimo
 */
public class Gasto {
    
    private int CodGast,montoGast,codInt,codSubcat;
    private String descGast;
    private Date fechaGast;

    public Gasto() {
    }

    public Gasto(int CodGast, int montoGast, int codInt, int codSubcat, String descGast, Date fechaGast) {
        this.CodGast = CodGast;
        this.montoGast = montoGast;
        this.codInt = codInt;
        this.codSubcat = codSubcat;
        this.descGast = descGast;
        this.fechaGast = fechaGast;
    }

    public int getCodGast() {
        return CodGast;
    }

    public void setCodGast(int CodGast) {
        this.CodGast = CodGast;
    }

    public int getMontoGast() {
        return montoGast;
    }

    public void setMontoGast(int montoGast) {
        this.montoGast = montoGast;
    }

    public int getCodInt() {
        return codInt;
    }

    public void setCodInt(int codInt) {
        this.codInt = codInt;
    }

    public int getCodSubcat() {
        return codSubcat;
    }

    public void setCodSubcat(int codSubcat) {
        this.codSubcat = codSubcat;
    }

    public String getDescGast() {
        return descGast;
    }

    public void setDescGast(String descGast) {
        this.descGast = descGast;
    }

    public Date getFechaGast() {
        return fechaGast;
    }

    public void setFechaGast(Date fechaGast) {
        this.fechaGast = fechaGast;
    }

    @Override
    public String toString() {
        return "Gasto{" + "CodGast=" + CodGast + ", montoGast=" + montoGast + ", codInt=" + codInt + ", codSubcat=" + codSubcat + ", descGast=" + descGast + ", fechaGast=" + fechaGast + '}';
    }
    
}
