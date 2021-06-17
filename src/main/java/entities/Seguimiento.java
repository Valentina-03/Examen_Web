package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "seguimiento")
@NamedQuery(name="Seguimiento.findAll", query="SELECT s FROM Seguimiento s")
public class Seguimiento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@Column(name="dategenerate")
	@Temporal (TemporalType.DATE)
	private Date dategenerate;
	
	@Column(name = "state")
	private Integer state;
	
	@Column(name = "result")
	private String result;
	
	@Column(name = "datailrequest")
	private String detailrequest;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "filegenerate")
	private String filegenerate;
	
	@ManyToOne()
	@JoinColumn(name = "report")
	private Reporte report;
}