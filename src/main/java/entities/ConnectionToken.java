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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUserdb() {
		return userdb;
	}

	public void setUserdb(String userdb) {
		this.userdb = userdb;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Typedb getType() {
		return type;
	}

	public void setType(Typedb type) {
		this.type = type;
	}

	public List<Reporte> getReportes() {
		return reportes;
	}

	public void setReportes(List<Reporte> reportes) {
		this.reportes = reportes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ConnectionToken(String host, String userdb, String pass, String db, String token, Integer port,
			Integer state, Usuario user, Typedb type) {
		super();
		this.host = host;
		this.userdb = userdb;
		this.pass = pass;
		this.db = db;
		this.token = token;
		this.port = port;
		this.state = state;
		this.user = user;
		this.type = type;
	}

	public ConnectionToken() {
		super();
	}
	
	
	
	
}
