package service;

import model.Ev;
import model.Villa;
import model.Yazlik;
import service.HouseService;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {


        /*HouseService servis = new HouseService();*/
        HouseService servis= new HouseService();




        Ev ev1 = new Ev();
        ev1.setFiyat(100000);
        ev1.setMetrekare(100);
        ev1.setOdasayisi(3);
        ev1.setSalonsayisi(2);
        servis.evler.add(ev1);
        servis.ev.add(ev1);

        Ev ev2 = new Ev();
        ev2.setFiyat(110000);
        ev2.setMetrekare(110);
        ev2.setOdasayisi(3);
        ev2.setSalonsayisi(2);
        servis.evler.add(ev2);
        servis.ev.add(ev2);

        Ev ev3 = new Ev();
        ev3.setFiyat(120000);
        ev3.setMetrekare(110);
        ev3.setOdasayisi(3);
        ev3.setSalonsayisi(2);
        servis.evler.add(ev3);
        servis.ev.add(ev3);


        Villa villa1 = new Villa();
        villa1.setFiyat(200000);
        villa1.setMetrekare(150);
        villa1.setOdasayisi(4);
        villa1.setSalonsayisi(3);
        servis.evler.add(villa1);
        servis.villas.add(villa1);

        Villa villa2 = new Villa();
        villa2.setFiyat(210000);
        villa2.setMetrekare(160);
        villa2.setOdasayisi(4);
        villa2.setSalonsayisi(3);
        servis.evler.add(villa2);
        servis.villas.add(villa2);

        Villa villa3 = new Villa();
        villa3.setFiyat(220000);
        villa3.setMetrekare(170);
        villa3.setOdasayisi(4);
        villa3.setSalonsayisi(3);
        servis.evler.add(villa3);
        servis.villas.add(villa3);

        Yazlik yazlik1 = new Yazlik();
        yazlik1.setFiyat(150000);
        yazlik1.setMetrekare(120);
        yazlik1.setOdasayisi(2);
        yazlik1.setSalonsayisi(2);
        servis.evler.add(yazlik1);
        servis.yazliks.add(yazlik1);

        Yazlik yazlik2 = new Yazlik();
        yazlik2.setFiyat(160000);
        yazlik2.setMetrekare(130);
        yazlik2.setOdasayisi(2);
        yazlik2.setSalonsayisi(2);
        servis.evler.add(yazlik2);
        servis.yazliks.add(yazlik2);

        Yazlik yazlik3 = new Yazlik();
        yazlik3.setFiyat(170000);
        yazlik3.setMetrekare(140);
        yazlik3.setOdasayisi(2);
        yazlik3.setSalonsayisi(2);
        servis.evler.add(yazlik3);
        servis.yazliks.add(yazlik3);




        System.out.println("Toplam Fiyat: " + servis.toplamFiyat());
        System.out.println("toplam Ev Fiyat " + servis.toplamEvFiyat());
        System.out.println("toplam Villa Fiyat " + servis.toplamVillaFiyat());
        System.out.println("toplam Yazlik Fiyat " + servis.toplamYazlikFiyat());
        System.out.println("Ortalama Metrekare (Ev): " + servis.ortalamaMetrekareEv());
        System.out.println("Ortalama Metrekare (Villa): " + servis.ortalamaMetrekareVilla());
        System.out.println("Ortalama Metrekare (Yazlik): " + servis.ortalamaMetrekareYazlik());
        System.out.println("Ortalama Metrekare (Tümü): " + servis.ortalamaMetrekare());

        List<Ev> filtrelenmisEvler = servis.filtreleOdaSalon(2, 2);
        System.out.println("Filtrelenmiş Evler:");
        for (Ev ev : filtrelenmisEvler) {
            System.out.println("- Fiyat: " + ev.getFiyat() + ", Metrekare: " + ev.getMetrekare());
        }
    }

}
