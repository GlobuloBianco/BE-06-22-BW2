package it.epicode.build_week_2.EPIC.ENERGY.SERVICES.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.build_week_2.EPIC.ENERGY.SERVICES.BeServiceIndirizzi;

@Repository
public interface BeServiceIndirizziRepo extends JpaRepository<BeServiceIndirizzi, Long>{

}
