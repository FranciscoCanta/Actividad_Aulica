package juego_de_cartas;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class baraja_Cartas {

    private LinkedList<Carta> cartas;
    private List<Carta> monton;

    public baraja_Cartas() {
       cartas = new LinkedList<>();
       monton = new LinkedList<>();
    }
   
   public void LlenarCartas(){
       String[] palos = {"Espada", "Oro", "Copa", "Basto"};
       for( String palo : palos){
           for(int numero = 1; numero<=12; numero++ ){
               if(numero != 8 && numero != 9){
                   cartas.add(new Carta(numero, palo));
               }
           }
       }
       System.out.println("estas son las cartas: ");
       for (int i = 0; i < 40; i++) {
           System.out.println(" "+cartas.get(i));
       }
   }
    
    public void barajar(){
        
        Collections.shuffle(cartas);
        System.out.println("Cartas desordenadas:");
    }
    
    public Carta siguienteCarta () throws IndexOutOfBoundsException{
        Carta ultimaCarta = cartas.get(cartas.size()-1);
        cartas.removeLast();
        return ultimaCarta;   
    }
    
    public void cartasDisponibles(){
         
         System.out.println("Las cartas disponibles son: " + cartas.size());
         
    }
    
    public LinkedList<Carta> darCartas(int cant){
        LinkedList<Carta> cartasDadas = new LinkedList<>();
        if (cant <= cartas.size()) {
           for (int i = 0; i < cant; i++) {
            cartasDadas.add(siguienteCarta());
           } 
        }else{
            System.out.println("No hay suficientes cartas");
        }
        return cartasDadas;
    }
    
    public void añadirMonton(Carta carta){
        monton.add(carta);
    }
    
    public void añadirMonton(LinkedList<Carta> cartas){
        monton.addAll(cartas);
    }
    
    public void cartasMonton(){
        System.out.println("Cartas en el monton");
        for (int i = 0; i < monton.size(); i++) {
           System.out.println(" " + monton.get(i));
        }
    }
    
    public void mostrarBarajas(){ 
       for (int i = 0; i < cartas.size(); i++) {
           System.out.println(" "+cartas.get(i));
       }   
    }  
}
