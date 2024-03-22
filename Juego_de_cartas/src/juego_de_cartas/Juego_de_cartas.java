
package juego_de_cartas;

public class Juego_de_cartas {

    public static void main(String[] args) {
        
      baraja_Cartas baraja = new baraja_Cartas();
            
        baraja.LlenarCartas();
        baraja.siguienteCarta();
        baraja.barajar();
        try{
           baraja.añadirMonton(baraja.siguienteCarta()); 
        }catch(IndexOutOfBoundsException e){
            System.out.println("El mazo se ha quedado sin cartas");
        }
        try{
            baraja.añadirMonton(baraja.darCartas(5));
        }catch(IndexOutOfBoundsException e){
            System.out.println("El mazo se ha quedado sin cartas");
        }
        baraja.cartasMonton();
        baraja.cartasDisponibles();  
         
        System.out.println("Cartas en el mazo");
        baraja.mostrarBarajas(); 
    }
}
