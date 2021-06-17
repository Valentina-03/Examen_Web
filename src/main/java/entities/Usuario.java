package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "state")
	private Integer state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol")
	private Rol rol;	
	
	public Usuario() {
		
	}	
	public Usuario(Integer id, String usuario, String email, String pass, Rol rol, Integer state) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.pass = pass;
		this.rol = rol;
		this.state = state;
	}
	
	public Usuario(String usuario, String email, String pass, Rol rol, Integer state) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.pass = pass;
		this.rol = rol;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}