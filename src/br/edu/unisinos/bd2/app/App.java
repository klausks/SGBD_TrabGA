package br.edu.unisinos.bd2.app;

import br.edu.unisinos.bd2.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd2");
		EntityManager em = emf.createEntityManager();


		Tecnico tecnico = new Tecnico("Renato");
		Clube clube = new Clube("Grêmio", Date.valueOf("1903-09-15"));
		Clube clube2 = new Clube("Inter", Date.valueOf("1910-01-27"));
		ClubeTecnico clubeTecnico = new ClubeTecnico(tecnico, clube);
		Posicao posicao = new Posicao("Zagueiro");
		Jogador jogador = new Jogador("Geromél", posicao);
		Posicao posicao2 = new Posicao("Meia");
		Jogador jogador2 = new Jogador("Douglas Costa", posicao2);
		ClubeJogador clubeJogador = new ClubeJogador(clube, jogador);
		ClubeJogador clubeJogador2 = new ClubeJogador(clube, jogador2);
		Campeonato campeonato = new Campeonato("Brasileirão", 1980, 30);
		Rodada rodada = new Rodada(campeonato, 1, 2, 3, 4, 5);
		Jogo jogo = new Jogo(campeonato, rodada, clube, clube2, 1, 2, 3, 4, 5, 6, 7, 8);

		em.getTransaction().begin();

		em.persist(tecnico);
		em.persist(clube);
		em.persist(clube2);
		em.persist(clubeTecnico);
		em.persist(posicao);
		em.persist(jogador);
		em.persist(clubeJogador);
		em.persist(posicao2);
		em.persist(jogador2);
		em.persist(clubeJogador2);
		em.persist(campeonato);
		em.persist(rodada);
		em.persist(jogo);

		em.getTransaction().commit();

	}

}