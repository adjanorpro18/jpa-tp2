package fr.diginamic.entites;

import javax.persistence.*;

/**
 * Classe Client avec ses attributs identifiant, nom et prenom
 */

@Entity
@Table
public class Client {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;


    @Column
    private String nom;


    @Column
    private String prenom;


    /**
     * Constructeur par default
     */
    public Client() {
    }

    /**
     * Constructeur avec parametres
     * @param id qui est l'identifiant du client
     * @param nom qui est le nom du client
     * @param prenom qui est le prénom du client
     */
    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }


    /**
     * @return l'identifiant du client
     */
    public int getId() {
        return id;
    }

    /**
     * @param id qui permet de setter l'identifiant du client
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return le nom du client
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom qui permet de setter le nom du client
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return le prenom du client
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom qui permet de setter le prénom du client
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
