public class AlgoritmaDers {
    int numara;
    String Ad, Soyad, Bolum, harfnotu;
    int Sinif;
    double vize_notu, final_notu, ort;
    
    AlgoritmaDers(int numara, String Ad, String Soyad, String Bolum, 
            int Sinif, int vize_notu, int final_notu){
        this.numara = numara; 
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bolum = Bolum;
        this.Sinif = Sinif;
        this.vize_notu = vize_notu;
        this.final_notu = final_notu;
    }
    
    AlgoritmaDers(int numara, String Ad, String Soyad) {
        this.numara = numara;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }
    
    void nothesapla() {
        ort = vize_notu * 0.4 + final_notu * 0.6;
    }
    
    void harfnothesapla() {
        if(ort<50){
            harfnotu  = "F";
        } 
        else if (51<=ort && ort<60) {
            harfnotu = "C";
        }
        else {
            harfnotu = "A";
        }
    }
}
