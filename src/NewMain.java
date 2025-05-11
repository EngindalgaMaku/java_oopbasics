public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dikdortgen d1 = new Dikdortgen(50,100);
        // Dikdörtgen tipinde bir d1 nesnesi (object) oluşturuldu.
        System.out.println("d1 dikdörtgenin yüksekliği: "+d1.height +
                " ve genişliği: " + d1.width);
        int cevre1 = d1.cevrehesap();
        int alan1 = d1.alanhesap();
        System.out.println("d1 dikdörtgenin cevresi: "+cevre1 + " ve alanı: "+alan1);
        
        Dikdortgen d2 = new Dikdortgen();
        System.out.println("d2 dikdörtgenin yüksekliği: "+d2.height +
                " ve genişliği: " + d2.width); 
        d2.height = 40; 
        d2.width = 60;
        System.out.println("d2 dikdörtgenin yüksekliği: "+d2.height +
                " ve genişliği: " + d2.width);
        int cevre2 = d2.cevrehesap();
        int alan2 = d2.alanhesap();
        System.out.println("d2 dikdörtgenin cevresi: "+cevre2 + " ve alanı: "+alan2);
        
    }
    
}
