package com.moustapha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moustapha.dao.GestionCompteRepository;
import com.moustapha.enties.Compte;

@RestController
public class CompteRestService {
	@Autowired
	private GestionCompteRepository gestionCompteRepository;
	@RequestMapping(value="/compte",method=RequestMethod.GET)
	public List<Compte> listComptes(){
		
		return gestionCompteRepository.findAll();
		
	}
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.GET)
	public Compte getCompte(@PathVariable("id")Long id){
		return gestionCompteRepository.findOne(id);
		
	}
	@RequestMapping(value="/comptes/",method=RequestMethod.POST)
	public Compte save(Compte c){
		return gestionCompteRepository.save(c);
		
	}
	

}
