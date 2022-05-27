package teszt;

import modell.Hajo;

public class TorpedoTeszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        
        new TorpedoTeszt().tesztLovesTalalt(4);
        new TorpedoTeszt().tesztLovesNemTalalt(5);
    }
    
    public String tesztLovesTalalt(int poz){
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
    public String tesztLovesNemTalalt(int poz){
        System.out.println("---mellé");
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("mellé") : "nem jó a találat ellenőrzése";
        System.out.println("Mellé teszt sikeres");
        return "";
    }
}

