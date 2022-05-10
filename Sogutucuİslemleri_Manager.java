package com.company;

public class Sogutucuİslemleri_Manager {
    public ISogutucuyuCalistir _sogutucuyuCalistir;

    public Sogutucuİslemleri_Manager(ISogutucuyuCalistir sogutucuyuAc)
    {
        _sogutucuyuCalistir=sogutucuyuAc;
    }

    public void SogutucuAc()
    {
        //System.out.println("Sogutucu Açılıyor...");
        _sogutucuyuCalistir.SogutucuyuAc();
    }
    public void SogutucuKapat()
    {
        //System.out.println("Sogutucu Kapatılıyor...");
        _sogutucuyuCalistir.SogutucuyuKapat();
    }
}
