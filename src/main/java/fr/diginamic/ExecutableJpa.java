package fr.diginamic;

import fr.diginamic.entites.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExecutableJpa {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bibliotheque");

        EntityManager em = factory.createEntityManager();

        EntityTransaction trans = em.getTransaction();
        trans.begin();

        Livre l1 = em.find(Livre.class, 1);
        System.out.println(l1.getId() + "  ' " + l1.getTitre() + " '  de  " +  l1.getAuteur());

    }
}
