package chiarafais;

import chiarafais.dao.EventoDAO;
import chiarafais.dao.LocationDAO;
import chiarafais.dao.PartecipazioniDAO;
import chiarafais.dao.PersonaDAO;
import chiarafais.entities.*;
import chiarafais.enums.EventoType;
import chiarafais.enums.SessoType;
import chiarafais.enums.StatoType;
import chiarafais.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("u4w3d4");

    public static void main(String[] args) {

       EntityManager em = emf.createEntityManager();
       EventoDAO sd = new EventoDAO(em);


       Location milano = new Location("stadio","Milano");
       Location roma = new Location("colosseo","Roma");
       LocationDAO lc = new LocationDAO(em);
       Location locationFound = lc.findById(1);



//       lc.save(roma);

//        PartitaDiCalcio partitaProva = new PartitaDiCalcio("partita",LocalDate.of(2024,5,30),"questa è una descrizione",EventoType.PUBBLICO,50000,milano,"Inter","Roma");

//        em.close();
//        emf.close();

    }
}
