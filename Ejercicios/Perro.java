public class Perro extends Animal {

    private boolean tieneCola;
    private boolean tieneOrejas;
    private String raza;


    public Perro(String nombre, double peso, boolean tienePiernas, boolean tieneOjos, boolean tieneCola, boolean tieneOrejas, String raza) {
        super(nombre, peso, tienePiernas, tieneOjos);
        this.tieneCola = tieneCola;
        this.tieneOrejas = tieneOrejas;
        this.raza = raza;
    }

    public void masticar(){
        System.out.println(super.mostrarNombre() + " esta masticando! ");
    }

    //Polimorfismo
    @Override
    public void comer(){
        System.out.println(super.mostrarNombre() + " esta comiendo!");
        masticar();
        super.comer();
    }



}