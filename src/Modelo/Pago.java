
package Modelo;

import java.util.Date;

public class Pago {
    private int idPago;
    private int idUsuario;
    private double monto;
    private String metodoPago;  // 'Tarjeta', 'Yape', 'Plin', 'Efectivo'
    private Date fechaPago;
    private String estado;      // 'Pagado', 'Pendiente', 'Fallido'

    // Constructor vacío
    public Pago() {}

    // Constructor con todos los atributos (excepto idPago que es identity/autoincrement)
    public Pago(int idUsuario, double monto, String metodoPago, Date fechaPago, String estado) {
        this.idUsuario = idUsuario;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    }

