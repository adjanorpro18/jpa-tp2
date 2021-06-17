package fr.diginamic.entites;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe Emprunt avec ses attributs identifiant, date de debut, date de fin, delai et l'identifiant du client
 */

@Entity
@Table
public class Emprunt {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column
    private LocalDate dateDebut;

    @Column
    private LocalDate dateFin;

    @Column
    private int delai;


    //Jointure avec la table client par la relation ManyToOne
    //Plusieurs emprunts peuvent faire référence à un client

    @ManyToOne
    @JoinColumn(name="idClient") // Colonne de jointure dans la Table Client
    private Client client;

    //Relation ManyToMany avec la table Emprunt

    @ManyToMany
    @JoinTable(name= "COMPO",
            joinColumns= @JoinColumn(name="idEmp", referencedColumnName = "id"),
            inverseJoinColumns= @JoinColumn(name="idLiv",referencedColumnName = "id")
    )
    private Set<Livre> livres;


    /**
     * Constructeur par default
     */
    public Emprunt() {
    }

    /**
     * constructeur avec parametres
     * @param id qui est l'identifiant de l'emprunt
     * @param dateDebut qui est la date de début de l'emprunt
     * @param dateFin qui est la date de fin de l'emprunt
     * @param delai qui est la durée qui separe les deux dates
     *
     */
    public Emprunt(int id, LocalDate dateDebut,LocalDate dateFin, int delai) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        livres = new HashSet<>();




    }

    /**
     * @return l'identifiant de l'emprunt
     */
    public int getId() {
        return id;
    }

    /**
     * @param id qui permet de setter l'identifiant dde l'emprunt
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return la date de début de l'emprunt
     */
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut qui permet de setter la date de début de l'emprunt
     */
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return retourne la date de fin de l'emprunt
     */
    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin qui permet de setter la date de fin de l'emprunt
     */
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }


    /**
     * @return qui retourne le delai entre les deux dates de l'emprunt
     */
    public int getDelai() {
        return delai;
    }

    /**
     * @param delai qui permet de setter le delai entre les deux dates de l'emprunt
     */

    public void setDelai(int delai) {
        this.delai = delai;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", delai=" + delai +
                '}';
    }
}
