package com.company;

public class SogutucuyuCalistir implements ISogutucuyuCalistir {

    @Override
    public void SogutucuyuAc() {
        System.out.println("Soğutucu Açıldı...");
    }

    @Override
    public void SogutucuyuKapat() {
        System.out.println("Soğutucu Kapatıldı...");
    }
}
