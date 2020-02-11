package asr.aos.app.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import asr.aos.app.entity.Evenement;

@Transactional
@Repository
	public interface GestionEvenement extends JpaRepository<Evenement,Long>{
//		Page<Evenement> findByClientIdClient(Long clientId, Pageable pageable);
//	    Optional<Evenement> findByIdPrestationAndClientIdClient(Long idPrestation, Long clientId);
//	    @Query("select prestation from Prestation prestation where prestation.etatPrestation=:etatPrestation")
//	    public Page<Evenement> findPrestationByEtat(@Param("etatPrestation") String etatPrestation, Pageable pageable);
//	    @Modifying
//	    @Query("update Prestation prestation set prestation.etatPrestation = :nouveauEtat where prestation.idPrestation=:idPrestation")
//	    public void modifierEtat(@Param("nouveauEtat")String etatPrestation,@Param("idPrestation") Long idPrestation);
//	    @Modifying
//	    @Query("delete Prestation prestation  where prestation.idPrestation=:idPrestation")
//	    public void supprimer(@Param("idPrestation") Long idPrestation);
//	    @Modifying
//	    @Query("update Prestation prestation set prestation.prixPrestation = :prixPrestation where prestation.idPrestation=:idPrestation")
//	    public void confirmer(@Param("prixPrestation")Float prixPrestation,@Param("idPrestation") Long idPrestation);

	}
