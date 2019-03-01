package co.edu.asys.facturaweb.dto;

public class ProductoDTO {

	private int codigo;
	private String nombre;
	private int cantidad;
	private int valorUnitario;
	private double porcentajeIva;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getPorcentajeIva() {
		return porcentajeIva;
	}

	public void setPorcentajeIva(double porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

}
