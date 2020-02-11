package asr.aos.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asr.aos.app.entity.Evenement;
import asr.aos.app.repository.EvenementRepository;

@Transactional
@CrossOrigin("*")
@RestController
public class EvenementService {
	
	@Autowired
	private EvenementRepository evenementRepository;

	@RequestMapping(value = "/evenments",method = RequestMethod.GET)
	public List<Evenement>  getEvenements(){
		return evenementRepository.findAll();
	}
	
	@RequestMapping(value = "/evenments/{id}",method = RequestMethod.GET)
	public Optional<Evenement>  getEvenement(@PathVariable Long id){
		return evenementRepository.findById(id);
	}
	
	@GetMapping("/personnes/{idCreateur}/evenements")
    public Page<Evenement>  monCalendrier(@PathVariable (value = "idCreateur") Long idCreateur,
            Pageable pageable) {
    		return evenementRepository.mesEvenements(idCreateur,pageable);
    	}
	
	@DeleteMapping("/supprimerEvenement/evenement/{idCreateur}")
    public void suppMonCalendrier(@PathVariable(value="idCreateur")Long idCreateur) {
		evenementRepository.suppMesEvenements(idCreateur);
    }
 
	@RequestMapping(value = "/evenments",method = RequestMethod.POST)
	public Evenement  enregistrer(@RequestBody Evenement ev){
		return evenementRepository.save(ev);
	}
	
	@RequestMapping(value = "/evenments/{id}",method = RequestMethod.DELETE)
	public boolean  supprimer(@PathVariable Long id){
		   evenementRepository.deleteById(id);
		   return true;
	}
	
	@RequestMapping(value = "/evenments/{id}",method = RequestMethod.PUT)
	public Evenement  update(@PathVariable Long id,@RequestBody Evenement ev){
		   ev.setId(id);
		   return evenementRepository.save(ev);
		  
	}
	
	
}
