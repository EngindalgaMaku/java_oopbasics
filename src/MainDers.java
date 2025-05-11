/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class MainDers {

    public static void main(String[] args) {
        AlgoritmaDers ogrenci1 = new AlgoritmaDers(20042205,"Ahmet","Uyumaz",
                "Yazılım Mühendisliği",2,65,75);
        System.out.println("ogrenci1 ad: "+ogrenci1.Ad + " ve soyad: "+ogrenci1.Soyad);
        ogrenci1.nothesapla();
        ogrenci1.harfnothesapla();
        System.out.println(ogrenci1.numara + " ya ait ortalaması: " + ogrenci1.ort + 
                " ve harf notu: "+ogrenci1.harfnotu);
        
        AlgoritmaDers ogrenci2 = new AlgoritmaDers(20042206,"Ayşe","Yılmaz");
        System.out.println("ogrenci2 ad: "+ogrenci2.Ad + " ve soyad: "+ogrenci2.Soyad);
        ogrenci2.vize_notu = 25; ogrenci2.final_notu = 75;
        ogrenci2.nothesapla();
        ogrenci2.harfnothesapla();
        System.out.println(ogrenci2.Ad + " " + ogrenci2.Soyad + " ortalaması: " + 
                ogrenci2.ort + " ve harf notu: "+ ogrenci2.harfnotu);
        
        
    }
    
}
