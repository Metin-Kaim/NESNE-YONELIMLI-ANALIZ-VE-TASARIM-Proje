package com.company;

public class Main {

    public static void main(String[] args) {
        SicaklikDegeri_Manager sicaklikDegeri_manager=new SicaklikDegeri_Manager(new SicaklikAlgilayici());
        sicaklikDegeri_manager.Sicaklik_Degerini_Goster();

        Sogutucuİslemleri_Manager sogutucuİslemleri_manager = new Sogutucuİslemleri_Manager(new SogutucuyuCalistir());
        sogutucuİslemleri_manager.SogutucuAc();
        sogutucuİslemleri_manager.SogutucuKapat();

    }
}
