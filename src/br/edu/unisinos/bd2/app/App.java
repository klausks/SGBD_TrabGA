package br.edu.unisinos.bd2.app;

import br.edu.unisinos.bd2.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.util.List;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd2");
		EntityManager em = emf.createEntityManager();



	}

}