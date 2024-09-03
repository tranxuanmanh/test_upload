package Phan1;

public class Girl {
    private Outfit outfit;
    public Girl(Outfit outfit){
        this.outfit=outfit;
    }
    public void show(){
       this.outfit.wear();
    }
}
