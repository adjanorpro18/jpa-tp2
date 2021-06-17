package fr.diginamic;

import fr.diginamic.entites.Client;
import fr.diginamic.entites.Emprunt;
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

        //Livre l1 = em.find(Livre.class, 1);
        //System.out.println(l1.getId() + "  ' " + l1.getTitre() + " '  de  " +  l1.getAuteur());

        //Requête permettant d'extraire un emprunt par son Id et afficher les livres qui lui sont associés

        Emprunt emp = em.find(Emprunt.class, 1);
        for (Livre l: emp.getLivres()
             ) {
            System.out.println(l);
        }

        //Requête permettant d'extraire tous les emprunts d'un client

        Client client1 = em.find(Client.class, 3);
        for (Emprunt emp1: client1.getEmprunts()
             ) {
            System.out.println(emp1);
        }








    }
}
