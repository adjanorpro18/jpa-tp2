package fr.diginamic.entites;

import javax.persistence.*;
import java.time.LocalDate;

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

    @Column
    private int idClient;


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
     * @param idClient qui est l'identifiant du client concerné par l'emprunt
     */
    public Emprunt(int id, LocalDate dateDebut,LocalDate dateFin, int delai, int idClient) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        this.idClient = idClient;
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

    /**
     * @return l'identifiant du client concerné par l'emprunt
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient qui permet de setter l'identifiant du client de l'emprunt
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

}
