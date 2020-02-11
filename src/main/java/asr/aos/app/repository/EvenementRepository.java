package asr.aos.app.repository;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import asr.aos.app.entity.Evenement;
import asr.aos.app.entity.Invitation;

//JpaRepsotory nous permet de faciliter le mapping relationnel : 
//on precise juste la classe et type de Id

@Repository
public interface  EvenementRepository extends JpaRepository<Evenement, Long>{	

//	Page<Invitation> findByIdClient(Long clientId, Pageable pageable);
//    Optional<Invitation> findByIdEvenementAndIdPersonne(Long idEvenement, Long idPersonne);
   
    @Query("select evenement from Evenement evenement where evenement.idCreateur=:idCreateur")
    public Page<Evenement> mesEvenements(@Param("idCreateur") Long idCreateur, org.springframework.data.domain.Pageable pageable);

    @Modifying
    @Query("delete Evenement evenement  where evenement.idCreateur=:idCreateur")
    public void suppMesEvenements(@Param("idCreateur") Long idCreateur);
}

