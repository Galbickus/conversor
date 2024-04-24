package modelos;

public record CotizacionOmdb(String usd,
                             String bob,
                             String ars,
                             String brl,
                             String col,
                             String cny,
                             String egp,
                             String aud,
                             String pen,
                             String mxn) {

    @Override
    public String toString() {
        return "CotizacionOmdb{" +
                "usd='" + usd + '\'' +
                ", bob='" + bob + '\'' +
                ", ars='" + ars + '\'' +
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

