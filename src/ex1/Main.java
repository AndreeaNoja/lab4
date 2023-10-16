package ex1;

enum echip{
        achizitioat,expus,vandut;
}

enum impr{
        color,
        albnegru;
}

enum cop{
        A3,A4;
}

enum sis{
        windows, linux;
        }
public class Main {
        public static void main(String[] args)
        {

        }
       public class echipamente
        {
                public final String denumire;
                public final int nr_inv;
                public final float pret;
                public final String zona_mag;

                echipamente(String denumire, int nrInv, float pret, String zonaMag) {
                        this.denumire = denumire;
                        nr_inv = nrInv;
                        this.pret = pret;
                        zona_mag = zonaMag;
                }
        void afis()
        {
                System.out.println(denumire + "," + nr_inv + "," + pret);
        }
        }
        class imprimanta extends echipamente
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

        class copiatoare extends ex1.echipamente
        {
                private final int p_ton;
                private final String format;

                copiatoare(String denumire, int nrInv, float pret, String zonaMag,int pTon, String format)
                {
                        super(denumire,nrInv,pret,zonaMag);
                        p_ton = pTon;
                        this.format = format;
                }
        }

        class sisteme extends ex1.echipamente
        {
                private final String tip_mon;
                private final int vit_proc;
                private final int c_hdd;
                private final String sis_op;


                sisteme(String denumire, int nrInv, float pret, String zonaMag,String tipMon, int vitProc, int cHdd, String sisOp) {
                        super(denumire,nrInv,pret,zonaMag);
                        tip_mon = tipMon;
                        vit_proc = vitProc;
                        c_hdd = cHdd;
                        sis_op = sisOp;
                }
        }
}




