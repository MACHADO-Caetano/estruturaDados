package classes.pedidos;

import java.sql.Date;


public class Pedidos {
    public int idPedido;
    public String nomeCliente;
    public Date dataPedido = new Date(System.currentTimeMillis());
    public double valorTotal;
    public String status;

    public Pedidos(int idPedido, String nomeCliente, double valorTotal, String status) {
        this.idPedido = idPedido;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.status = status;
    }
}
