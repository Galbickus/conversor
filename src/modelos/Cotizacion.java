package modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Cotizacion {
    @SerializedName("BOB")
    private String bob;
    @SerializedName("ARS")
    private String ars;
    @SerializedName("USD")
    private String usd;
    @SerializedName("BRL")
    private String brl;
    @SerializedName("COL")
    private String col;
    @SerializedName("CNY")
    private String cny;
    @SerializedName("EGP")
    private String egp;
    @SerializedName("AUD")
    private String aud;
    @SerializedName("PEN")
    private String pen;
    @SerializedName("MXN")
    private String mxn;

    private Map<String, Double> tasasDeConversion;

    public Cotizacion(String bob, String ars, String usd, String brl, String col, String cny, String egp, String aud, String pen, String mxn, Map<String, Double> tasasDeConversion) {
        this.bob = bob;
        this.ars = ars;
        this.usd = usd;
        this.brl = brl;
        this.col = col;
        this.cny = cny;
        this.egp = egp;
        this.aud = aud;
        this.pen = pen;
        this.mxn = mxn;
        this.tasasDeConversion = tasasDeConversion;
    }

   /* public Cotizacion(String bob, String ars, String usd, String brl, String col, String cny, String egp, String aud, String pen, String mxn) {
        this.bob = bob;
        this.ars = ars;
        this.usd = usd;
        this.brl = brl;
        this.col = col;
        this.cny = cny;
        this.egp = egp;
        this.aud = aud;
        this.pen = pen;
        this.mxn = mxn;
    }*/

    public Cotizacion(CotizacionOmdb cotizacionOmdb){
        this.bob = cotizacionOmdb.bob();
        this.ars = cotizacionOmdb.ars();
        this.usd = cotizacionOmdb.usd();
        this.brl = cotizacionOmdb.brl();
        this.col = cotizacionOmdb.col();
        this.cny = cotizacionOmdb.cny();
        this.egp = cotizacionOmdb.egp();
        this.aud = cotizacionOmdb.aud();
        this.pen = cotizacionOmdb.pen();
        this.mxn = cotizacionOmdb.mxn();
    }


    public String getBob() {
        return bob;
    }

    public String getArs() {
        return ars;
    }

    public String getUsd() {
        return usd;
    }

    public String getBrl() {
        return brl;
    }

    public String getCol() {
        return col;
    }

    public String getCny() {
        return cny;
    }

    public String getEgp() {
        return egp;
    }

    public String getAud() {
        return aud;
    }

    public String getPen() {
        return pen;
    }

    public String getMxn() {
        return mxn;
    }

    public Map<String, Double> getTasasDeConversion() {
        return tasasDeConversion;
    }

    @Override
    public String toString() {
        return "La clase cotización sacó del Json lo siguiente: Cotizacion{" +
                "bob='" + bob + '\'' +
                ", ars='" + ars + '\'' +
                ", usd='" + usd + '\'' +
                ", brl='" + brl + '\'' +
                ", col='" + col + '\'' +
                ", cny='" + cny + '\'' +
                ", egp='" + egp + '\'' +
                ", aud='" + aud + '\'' +
                ", pen='" + pen + '\'' +
                ", mxn='" + mxn + '\'' +
                '}';
    }
}

