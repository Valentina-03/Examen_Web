package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "typedb")
@NamedQuery(name="Typedb.findAll", query="SELECT t FROM Typedb t")
public class Typedb implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false)
	private String id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "driver")
	private String driver;
	
	@Column(name = "aditional")
	private String aditional;
	
	@OneToMany(mappedBy = "type")
	List<ConnectionToken> tokens=new ArrayList<>();
	
	public Typedb(){
		
	}
	
	public Typedb(String id, String description, String driver, String aditional) {
		super();
		this.id = id;
		this.driver = driver;
		this.description = description;
		this.aditional = aditional;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAditional() {
		return aditional;
	}

	public void setAditional(String aditional) {
		this.aditional = aditional;
	}
	
	public String getDriver() {
		return this.driver;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public List<ConnectionToken> getTokens() {
		return tokens;
	}

	public void setTokens(List<ConnectionToken> tokens) {
		this.tokens = tokens;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
