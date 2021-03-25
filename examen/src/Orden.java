public class Orden {
    private String descripcion;
    private int numero;
    private int costo;
    private int numeroMesa;
    private Mesero mesero;
    public Orden() {
        this(new Mesero(), "xd", 50000, 2);
    }

    public Orden(Mesero mesero, String descripcion, int costo, int numeroMesa) {
        this.mesero = mesero;
        this.descripcion = descripcion;
        this.costo = costo;
        this.numeroMesa = numeroMesa;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Mesero getWaiter() {
        return mesero;
    }

    public void setWaiter(Mesero mesero) {
        this.mesero = mesero;
    }
}
