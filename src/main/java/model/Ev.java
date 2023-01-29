package model;

public class Ev {

    private int fiyat;
    private int metrekare;
    private int odasayisi;
    private int salonsayisi;

    public Ev() {
    }

    public Ev(int fiyat, int metrekare, int odasayisi, int salonsayisi) {
        this.fiyat = fiyat;
        this.metrekare = metrekare;
        this.odasayisi = odasayisi;
        this.salonsayisi = salonsayisi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(int metrekare) {
        this.metrekare = metrekare;
    }

    public int getOdasayisi() {
        return odasayisi;
    }

    public void setOdasayisi(int odasayisi) {
        this.odasayisi = odasayisi;
    }

    public int getSalonsayisi() {
        return salonsayisi;
    }

    public void setSalonsayisi(int salonsayisi) {
        this.salonsayisi = salonsayisi;
    }
}
