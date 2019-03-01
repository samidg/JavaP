package co.edu.asys.facturaweb.dto;

public class ClienteDTO {

	private int codigo;
	private TipoIdentificacionDTO tipoidentificacion;
	private String numeroIdentifiacion;
	private String nombreCompleto;
	private String correoElectronico;
	private String numeroCelular;
	private String numeroFijo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public TipoIdentificacionDTO getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacionDTO tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public String getNumeroIdentifiacion() {
		return numeroIdentifiacion;
	}

	public void setNumeroIdentifiacion(String numeroIdentifiacion) {
		this.numeroIdentifiacion = numeroIdentifiacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getNumeroFijo() {
		return numeroFijo;
	}

	public void setNumeroFijo(String numeroFijo) {
		this.numeroFijo = numeroFijo;
	}

}
