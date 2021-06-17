package fr.diginamic.entites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe Client avec ses attributs identifiant, nom et prenom
 */

@Entity
@Table(name ="CLIENT")
public class Client {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;


    @Column
    private String nom;


    @Column
    private String prenom;

    //Jointure avec la table emprunt
    //Un client peut effectuer plusieurs emprunts

    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunts; // Reference vers les emprunts


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
        emprunts = new HashSet<>();
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


    /**
     * @return les emprunts rattachés à un client donné
     */
    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    /**
     * @param emprunts setter les emprunts rattachés à un client donné
     */

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

}
