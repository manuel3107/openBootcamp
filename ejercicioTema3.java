
package EjercicioTema3;


public class ejercicioTema3 {

    public static void main(String[] args) {
       int resultado;
       resultado = suma(10, 20, 30);
       System.out.println(resultado);
       
       
       coche miCoche = new coche();
       miCoche.PonerPuertas();
       System.out.println(miCoche.puertas);
    }
    
    public static int suma(int a, int b, int c){
    
        return a+b+c;
    }
    
    class coche {
    
        public int puertas = 0;
            
        public void PonerPuertas(){
        
            this.puertas++;
        }    
    
    }
    
}
