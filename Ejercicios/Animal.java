public class Animal {
    
    private String nombre;
    private double peso;
    private boolean tienePiernas;
    private boolean tieneOjos;

    public Animal(String nombre, double peso, boolean tienePiernas, boolean tieneOjos){
        this.nombre = nombre;
        this.peso = peso;
        this.tienePiernas = tienePiernas;
        this.tieneOjos = tieneOjos;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("El animal esta comiendo! ");
    }

    public void moverse(){
        System.out.println("El animal se esta moviendo! ");
    }



}
