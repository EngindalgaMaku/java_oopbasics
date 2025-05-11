public class Dikdortgen {
    int width; 
    int height;
    
    Dikdortgen(){
        this.height = 0;
        this.width = 0;
    }
    
    Dikdortgen(int height, int width){ // Constructor (Yapılandırıc)
        this.height = height;
        this.width = width;
    }
    
    int cevrehesap() {
        return 2*height + 2*width;
    }
    
    int alanhesap() {
        return width*height;
    }    
}
