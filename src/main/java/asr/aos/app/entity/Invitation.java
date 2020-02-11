package asr.aos.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invitation {
	
	@Id @GeneratedValue
	private Long idInvitation;
	private Long idEvenement;
	private Long idPersonne;
	public Long getIdInvitation() {
		return idInvitation;
	}
	public void setIdInvitation(Long idInvitation) {
		this.idInvitation = idInvitation;
	}
	public Long getIdEvenement() {
		return idEvenement;
	}
	public void setIdEvenement(Long idEvenement) {
		this.idEvenement = idEvenement;
	}
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public Invitation(Long idEvenement, Long idPersonne) {
		super();
		this.idEvenement = idEvenement;
		this.idPersonne = idPersonne;
	}
	public Invitation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
