package asr.aos.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asr.aos.app.entity.Invitation;

//JpaRepsotory nous permet de faciliter le mapping relationnel : 
//on precise juste la classe et type de Id

@Repository
public interface  InvitationRepository extends JpaRepository<Invitation, Long>{	

}
