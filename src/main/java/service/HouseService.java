package service;

import model.Ev;
import model.Villa;
import model.Yazlik;

import java.util.ArrayList;
import java.util.List;

public class HouseService {

    protected List<Ev> evler = new ArrayList<>();
    protected List<Ev> ev = new ArrayList<>();
    protected List<Villa> villas = new ArrayList<>();
    protected List<Yazlik> yazliks = new ArrayList<>();

    public int toplamFiyat() {
        int toplam = 0;
        for (Ev ev : evler) {
            toplam += ev.getFiyat();
        }
        return toplam;
    }

    public int toplamEvFiyat(){
        int toplam=0;
        for (Ev evs: ev
             ) {
            toplam += evs.getFiyat();
        }
        return toplam;
    }

    public int toplamVillaFiyat(){
        int toplam=0;
        for (Villa villa: villas
        ) {
            if (ev instanceof Ev)
                toplam += villa.getFiyat();
        }
        return toplam;
    }


    public int toplamYazlikFiyat(){
        int toplam=0;
        for (Yazlik yazlik: yazliks
             ) {
            toplam +=yazlik.getFiyat();
        }
        return toplam;
    }

    public double ortalamaMetrekareEv() {
        int toplamMetrekare = 0;
        for (Ev ev : evler) {
            toplamMetrekare += ev.getMetrekare();
        }
        return (double) toplamMetrekare / evler.size();
    }

    public double ortalamaMetrekareVilla() {
        int toplamMetrekare = 0;
        int villaSayisi = 0;
        for (Ev ev : evler) {
            if (ev instanceof Villa) {
                toplamMetrekare += ev.getMetrekare();
                villaSayisi++;
            }
        }
        return (double) toplamMetrekare / villaSayisi;
    }

    public double ortalamaMetrekareYazlik() {
        int toplamMetrekare = 0;
        int yazlikSayisi = 0;
        for (Ev ev : evler) {
            if (ev instanceof Yazlik) {
                toplamMetrekare += ev.getMetrekare();
                yazlikSayisi++;
            }
        }
        return (double) toplamMetrekare / yazlikSayisi;
    }

    public double ortalamaMetrekare() {
        int toplamMetrekare = 0;
        for (Ev ev : evler) {
            toplamMetrekare += ev.getMetrekare();
        }
        return (double) toplamMetrekare / evler.size();
    }

    public List<Ev> filtreleOdaSalon(int odasayisi, int salonsayisi) {
        List<Ev> sonuc = new ArrayList<>();
        for (Ev ev : evler) {
            if (ev.getOdasayisi() == odasayisi && ev.getSalonsayisi() == salonsayisi) {
                sonuc.add(ev);
            }
        }
        return sonuc;
    }
}
