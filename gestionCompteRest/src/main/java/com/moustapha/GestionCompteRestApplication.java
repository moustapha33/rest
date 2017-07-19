package com.moustapha;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.moustapha.dao.GestionCompteRepository;
import com.moustapha.enties.Compte;

@SpringBootApplication
public class GestionCompteRestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionCompteRestApplication.class, args);
		GestionCompteRepository gestionRepository = ctx.getBean(GestionCompteRepository.class);
		gestionRepository.save(new Compte("Jean", new Date(), 20500));
		gestionRepository.save(new Compte("Jeanne", new Date(), 8300));
		gestionRepository.save(new Compte("jules", new Date(), -300));
		
		List<Compte> listeComptes=gestionRepository.findAll();
		listeComptes.forEach(c->System.out.println(c.getDetenteur()));
		
	}
/*	public class GestionCompteRestApplication implements CommandLineRunner{
 * @Autowired
	GestionCompteRepository gestionRepository;
	public static void main(String[] args) {
		 SpringApplication.run(GestionCompteRestApplication.class, args);
	}

@Override
public void run(String... arg0) throws Exception {
	// TODO Auto-generated method stub
	gestionRepository.save(new Compte("Jean", new Date(), 2500));
	gestionRepository.save(new Compte("Jaques", new Date(), 1300));
	gestionRepository.save(new Compte("jules", new Date(), -300));
	
	List<Compte> listeComptes=gestionRepository.findAll();
	listeComptes.forEach(c->System.out.println(c.getDetenteur()));
	
}*/
}
 