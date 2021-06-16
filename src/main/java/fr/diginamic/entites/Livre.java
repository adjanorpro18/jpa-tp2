package fr.diginamic.entites;


import javax.persistence.*;

/**
 * Classe Livre avec un identifiant, le titre et le nom de l'auteur
 */

@Entity
@Table
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String titre;

    @Column
    private String auteur;


    /**
     * Constructeur par default
     */
    public Livre() {
    }

    /**
     * Constructeur de la classe Livre avec ses diffetents attributs
     * @param id qui renseigne sur l'identifiant du livre
     * @param titre qui se refère au titre du livre
     * @param auteur qui renseigne sur l'auteur du livre
     */

    public Livre(int id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    /**
     * Constructeur avec parametres
     * @param id
     */
    public Livre(int id) {
        this.id = id;
    }

    /**
     *
     * @return identifinat de la classe livre
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id permet de setter l(identifiant du livre
     */

    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return le titre du livre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Methode qui permet de modifier le nom du livre
     * @param titre
     */

    public void setTitre(String titre) {
        this.titre = titre;
    }


    /**

     * @return l'auteur du livre
     */
    public String getAuteur() {
        return auteur;
    }


    /**
     * Methode qui permet de modifier le nom de l'auteur
     * @param auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * Methode toString qui retourne les données de la classe Livre
     * @return
     */
    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
