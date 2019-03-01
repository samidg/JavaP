package co.edu.asys.facturaweb.dto;

import java.util.Date;

public class FacturaDTO {

	private int codigo;
	private ClienteDTO cliente;
	private Date fecha;
	private TipoPagoDTO tipoPago;
	private EmpleadoDTO empleado;
	private boolean facturaConfirmada;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TipoPagoDTO getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPagoDTO tipoPago) {
		this.tipoPago = tipoPago;
	}

	public EmpleadoDTO getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoDTO empleado) {
		this.empleado = empleado;
	}

	public boolean isFacturaConfirmada() {
		return facturaConfirmada;
	}

	public void setFacturaConfirmada(boolean facturaConfirmada) {
		this.facturaConfirmada = facturaConfirmada;
	}

}
