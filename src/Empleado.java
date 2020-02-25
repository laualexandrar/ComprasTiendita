public class Empleado {

    private int id;
    private String nombre;
    private int telefono;
    private String empresa;

    Empleado(int id, String nombre, String empresa){
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public void showName(){
        System.out.println("El Nombre del Empleado es: " + nombre);
}

    public void showId(){
        System.out.println("El Numero de documento del Empleado es: " + id;
    }

}
