
package EjercicioTema8;


public class EjercicioTema8 {

    
    public static void main(String[] args) {
       Persona persona = new Persona();
       
       persona.setNombre("Manuel");
       persona.setEdad("31");
       persona.setTelefono("1112345678");
       
       System.out.println(persona.getNombre());
       System.out.println(persona.getEdad());
       System.out.println(persona.getTelefono());
        
    }
    
    
    
}

public class Persona {
    
    private String nombre;
    private String edad;
    private  String telefono;
    

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

           
}

