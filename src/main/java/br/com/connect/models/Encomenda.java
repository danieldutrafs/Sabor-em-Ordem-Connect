package br.com.connect.models;

/**
 *
 * @author auxiliar.tirs
 */
public class Encomenda {
    private long id;
    private String status;
    private Clientes cliente;
    private double valorEntrada;
    private double valorTotal;
    private boolean retirada;

    public Encomenda(long id, String status, Clientes cliente, double valorEntrada, double valorTotal, boolean retirada) {
        this.id = id;
        this.status = status;
        this.cliente = cliente;
        this.valorEntrada = valorEntrada;
        this.valorTotal = valorTotal;
        this.retirada = retirada;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isRetirada() {
        return retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }
}
