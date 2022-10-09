
package EjercicioTema4;

public class EjercicioTema4 {

   
    public static void main(String[] args) {
        
        int numeroIf = 30;
        
        if (numeroIf >= 0 ){
            
            System.out.println(numeroIf + "Es Positivo");
        }
        
        else System.out.println(numeroIf + "Es Negativo");
        
    }
    
    //----------------------------------------------------------
    
    int numeroWhile = 0;
    while (numeroWhile < 3){
    
        numeroWhile++;
        System.out.println(numeroWhile);
    
    }
    
    
    
    
    //-------------------------------------------------------
    
    
    int nuemroWhile = 10;
    
    do {System.out.println(nuemroWhile);
            
        nuemroWhile +=1;
    }
    while(nuemroWhile < 10);
        
    //-------------------------------------------------------------------
        
    for (int numeroFor = 0; int numeroFor >= 3; int nuemroFor++){

        System.out.println(numeroFor);
            
    };
    
    
    //---------------------------------------------------------------------
    
    
    String estacion = "primaver;a";
    
    switch (estacion){
    
        case estacion = "verano":
            
            System.out.println("estamos en verano");
    
            break;
        case estacion = "otoño":
            
            System.out.println("estamos en otoño");
    
            break;
        case estacion = "primavera":
            
            System.out.println("estamos en primavera");
    
            break;
            
        case estacion = "invierno":
            
            System.out.println("estamos en invierno");
    
            break;
            
        default: System.out.println("la variable estacion no es una estacion");
    
    }
}
