
package juego_de_cartas;


public class Juego_de_cartas {

    public static void main(String[] args) {
        
      baraja_Cartas baraja = new baraja_Cartas();
      
      baraja.LlenarCartas();
        
      baraja.barajar();
      
      baraja.mostrarBarajas();
      
      baraja.cartasDisponibles();
      
      try{
          for (int i = 0; i < 41; i++) {
           baraja.siguienteCarta(); 
        }
        }catch(IndexOutOfBoundsException e){
            System.out.println("El mazo se ha quedado sin cartas");
        }
      
        baraja.mostrarBarajas(); 
        System.out.println("hola");
      
    }

}
