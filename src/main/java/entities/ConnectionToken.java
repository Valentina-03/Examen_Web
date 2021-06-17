package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "connectiontoken")
@NamedQuery(name="ConnectionToken.findAll", query="SELECT ct FROM ConnectionToken ct")
public class ConnectionToken implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "host")
	private String host;
	
	@Column(name = "userdb")
	private String userdb;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "db")
	private String db;
	
	@Column(name = "token")
	private String token;
	
	@Column(name = "port")
	private Integer port;
	
	@Column(name = "state")
	private Integer state;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "user")
	private Usuario user;
	
	@ManyToOne()
	@JoinColumn(name = "type")
	private Typedb type;
	
	@OneToMany(mappedBy = "conexion")
	List<Reporte> reportes=new ArrayList<>();
	
	
}
