package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reporte")
@NamedQuery(name="Reporte.findAll", query="SELECT r FROM Reporte r")
public class Reporte implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	
	@Column(name="file")
	private String file;
	
	@Column(name="datecreate")
	@Temporal (TemporalType.DATE)
	private Date datecreate;
	
	@Column(name="state")
	private String state;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne()
	@JoinColumn(name = "conexion")
	private Typedb conexion;
	
	@OneToMany(mappedBy = "report")
	List<Seguimiento> seguimientos=new ArrayList<>();
}