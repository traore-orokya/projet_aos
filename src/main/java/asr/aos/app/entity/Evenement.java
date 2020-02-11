package asr.aos.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Evenement implements Serializable{

	@Id @GeneratedValue
	private Long idEvenement;
	private String description;
	private String lieu;
	
	// id de la personne qui crée cet evenement
	private Long idCreateur;
		
	
	public Long getIdEvenement() {
		return idEvenement;
	}
	public void setIdEvenement(Long idEvenement) {
		this.idEvenement = idEvenement;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Long getIdCreateur() {
		return idCreateur;
	}
	public void setIdCreateur(Long idCreateur) {
		this.idCreateur = idCreateur;
	}
	@Temporal(TemporalType.DATE)
	private Date dateEvenement;
	
	
	public Evenement(String description, String lieu, Date dateEvenement, Long idCreateur) {
		super();
		this.description = description;
		this.lieu = lieu;
		this.dateEvenement = dateEvenement;
		this.idCreateur = idCreateur;
	}
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return idEvenement;
	}
	public void setId(Long id) {
		this.idEvenement = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(Date dateEvenment) {
		this.dateEvenement = dateEvenment;
	}
	
	
}
