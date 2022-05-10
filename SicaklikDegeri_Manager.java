package com.company;

public class SicaklikDegeri_Manager
{
    public ISicaklikAlgilayici _sicaklikAlgilayici;

    public SicaklikDegeri_Manager(ISicaklikAlgilayici sicaklikAlgilayici)
    {
        _sicaklikAlgilayici=sicaklikAlgilayici;
    }

    public void Sicaklik_Degerini_Goster()
    {
        System.out.println("Sıcaklik Ölçülüyor...   "+_sicaklikAlgilayici.SicaklikOlcer());
    }
}
