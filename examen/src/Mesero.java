public class Mesero {
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;
    private int salario;
    private int ordenesTotales;
    private double gananciatotal;
    private int experiencia ;

    public Mesero() {
        this("1034298939", "santiago","david", 18,4);
    }

    public Mesero(String documento, String nombre, String apellido, int edad, int experiencia) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = 0;
        this.ordenesTotales = 0;
        this.gananciatotal= 0;
        this.experiencia = experiencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String document) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String surname) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        this.edad = edad;
    }

    public void agregarPropina(double propinas) {
        salario += propinas;
    }

    public void setSalario(int salary) {
        this.salario = salario;
    }

    public int getTotalOrders() {
        return ordenesTotales;
    }

    public void addTotalOrders() {
        this.ordenesTotales++;
    }
    public void setGananciatotal(int gananciatotal) {
        this.gananciatotal += gananciatotal;
    }

    public double getGananciatotal() {
        return gananciatotal;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}