package juego_de_cartas;
import static  java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class baraja_Cartas {

    private List<Carta> cartas;
    private List<Carta> monton;
    //private List<Carta> cartas = new ArrayList<>();
    private int cantCartasEntregadas;
    //private List<Carta> monton = new ArrayList<>();

    public baraja_Cartas() {
       cartas = new ArrayList<>();
       monton = new ArrayList<>();
       
       
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
    
    
//    private String[] barajaCartas = new String[40];
    
//    public void llenarCartas(){
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 10; j++) {
//                switch (i) {
//                    case 0:
//                        if (j<7) {
//                            String num = Integer.toString(j+1);
//                            barajaCartas[j] = num + "Espada";
//                        }else{
//                            String num = Integer.toString(j+3);
//                            barajaCartas[j] = num + "Espada";
//                        }
//                        break; 
//                    case 1:
//                        if (j!= 7 && j!=8) {
//                            String num = Integer.toString(j+1);
//                            barajaCartas[j] = num + "Oro";
//                        }
//                        break;
//                    case 2: 
//                        if (j!= 7 && j!=8) {
//                            String num = Integer.toString(j+1);
//                            barajaCartas[j] = num + "Basto";
//                        }
//                        break;
//                    case 3:
//                        if (j<7) {
//                            String num = Integer.toString(j+1);
//                            barajaCartas[j] = num + "copa";
//                        }else{
//                            String num = Integer.toString(j+3);
//                            barajaCartas[j] = num + "copa";
//                        }
//                        break;
//                    default:
//                        throw new AssertionError();
//                }
//            }
//        }
//        for (int i = 0; i < 40; i++) {
//            System.out.println(barajaCartas[i]);
//        }
//    }
    
    public void barajar(){
        
        Collections.shuffle(cartas);
        System.out.println("Cartas desordenadas:");
    }
    
    public void siguienteCarta(){
        
    }
    
    public void cartasDisponibles(){
        
    }
    
    public void darCartas(){
        
    }
    
    public void cartasMonton(){
        
    }
    
    public void mostrarBarajas(){
        
       for (int i = 0; i < 40; i++) {
           System.out.println(" "+cartas.get(i));
       }
        
    }
    
    
}
