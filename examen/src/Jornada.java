import java.util.ArrayList;
import java.util.List;

public class Jornada {
    private int dia;
    private int mes;
    private int año;
    private List<Orden> listaOrdenes;
    private List<Mesero> meseroList;
    private double procentajePropina;
    private double totalGanado;
    private int limiteMeseros;


    public Jornada() {
        this(22, 3, 2021, 2, 4);
    }

    public Jornada(int dia, int mes, int año, double procentajePropina, int limiteMeseros) {
        this.limiteMeseros = limiteMeseros;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.procentajePropina = procentajePropina;
        this.listaOrdenes = new ArrayList<>(50);
        this.meseroList = new ArrayList<>(limiteMeseros);
    }
    public void addOrden(Mesero mesero, String descripcion, int numeroMesa, int costo) {
        Orden orden = new Orden(mesero, descripcion,costo, numeroMesa);
        if (listaOrdenes.size() > 0) {
            orden.setNumero(listaOrdenes.get(listaOrdenes.size() - 1).getNumero() + 1);
        }
        totalGanado += costo;
        mesero.agregarPropina(costo * procentajePropina /100);
        mesero.addtotalordenes();
        mesero.addGananciatotal(costo);
        listaOrdenes.add(orden);
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getTotalGanado() {
        return totalGanado;
    }

    public List<Orden> getOrderList() {
        return listaOrdenes;
    }

    public void addWaiter(Mesero mesero) {
        meseroList.add(mesero);
    }

    public List<Mesero> getWaiterList() {
        return meseroList;
    }

}
