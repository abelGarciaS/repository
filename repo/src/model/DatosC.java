package model;

public class DatosC {

	private String email;
	private String telefono;
	private String Instagram;
	
	public DatosC() {
		
	}
	
	public DatosC(String email,String telefono,String Instagram ) {
		setEmail(email);
		setTelefono( telefono);
		setInstagram( Instagram);
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getInstagram() {
		return Instagram;
	}
	public void setInstagram(String instagram) {
		Instagram = instagram;
	}

	@Override
	public String toString() {
		return "DatosC [email=" + email + ", telefono=" + telefono + ", Instagram=" + Instagram + "]";
	}
	
	
}
