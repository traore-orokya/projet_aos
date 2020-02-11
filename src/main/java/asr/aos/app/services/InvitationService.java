package asr.aos.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asr.aos.app.entity.Invitation;
import asr.aos.app.entity.Personne;
import asr.aos.app.repository.InvitationRepository;

@RestController
public class InvitationService {
	
	@Autowired
	private InvitationRepository invitationRepository;

	@RequestMapping(value = "/invitations",method = RequestMethod.GET)
	public List<Invitation>  getEvenements(){
		return invitationRepository.findAll();
	}
	
	@RequestMapping(value = "/Invitations/{id}",method = RequestMethod.GET)
	public Optional<Invitation>  getEvenement(@PathVariable Long id){
		return invitationRepository.findById(id);
	}
	
	@RequestMapping(value = "/Invitations",method = RequestMethod.POST)
	public Invitation  enregistrer(@RequestBody Invitation ev){
		return invitationRepository.save(ev);
	}
	
	@RequestMapping(value = "/Invitations/{id}",method = RequestMethod.DELETE)
	public boolean  supprimer(@PathVariable Long id){
		invitationRepository.deleteById(id);
		   return true;
	}
	
	@RequestMapping(value = "/Invitations/{id}",method = RequestMethod.PUT)
	public Invitation  update(@PathVariable Long id,@RequestBody Invitation ev){
		   ev.setIdInvitation(id);
		   return invitationRepository.save(ev);
		  
	}
	
	
}
