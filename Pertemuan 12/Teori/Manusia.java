package Minggu12.Teori;

public class Manusia {
  public void nyalakanPerangkat(Elektronik perangkat) {
    if (perangkat instanceof TelevisiJadul) {
      TelevisiJadul tvjadul = (TelevisiJadul) perangkat;
      System.out.println(tvjadul.getModeInput());
      System.out.println("Voltase televisi : " + tvjadul.getVoltase());
    } else if (perangkat instanceof TelevisiModern) {
      TelevisiModern tvmodern = (TelevisiModern) perangkat;
      System.out.println(tvmodern.getModeInput());
      System.out.println("Voltase televisi : " + tvmodern.getVoltase());
    }
  }
}
