package cz.czechitas.ukol3;

public class Pocitac {
   boolean jeZapnuty;// – toto bude pouze field, bez getteru a setteru
   private Procesor cpu;// – budeme se tvářit, že počítač má jen jeden procesor s jedním jádrem
   private Pamet ram;
   private Disk pevnyDisk;

   @Override
   public String toString() {
      return super.toString(); //metoda ma v lidsky čitelné podobě vypisovat údaje o daném zařízení.
   }

   public boolean jeZapnuty(){
      System.out.println("pocitat se zapnul");
      return jeZapnuty();
   }
   public void zapise(){
      System.out.println("pocitac se zapnul");

   }
   public void vypise(){
      return;
}



}
