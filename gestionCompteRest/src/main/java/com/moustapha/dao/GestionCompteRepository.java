package com.moustapha.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moustapha.enties.Compte;

public interface GestionCompteRepository extends JpaRepository<Compte, Long> {

}
