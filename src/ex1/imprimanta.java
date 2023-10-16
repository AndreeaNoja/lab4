package ex1;

public class imprimanta extends echipamente
{
    private final int ppm;
    private final int rezolutie;
    private final int p_car;
    private final String mod_tiparire;
    imprimanta(String denumire, int nrInv, float pret, String zonaMag, int ppm, int rezolutie, int pCar, String modTiparire) {
        super(denumire, nrInv, pret, zonaMag);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        p_car = pCar;
        mod_tiparire = modTiparire;
    }
}

