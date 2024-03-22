
package juego_de_cartas;


public class Carta {
    private int numero;
    private String palo;
    

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
      return numero + " de " + palo;
    }
    
    
}
