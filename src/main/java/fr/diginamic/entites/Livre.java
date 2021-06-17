package fr.diginamic.entites;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    //Relation ManyToMany avec la table Emprunt
    @ManyToMany
    @JoinTable(name = "COMPO",
            joinColumns = @JoinColumn(name = "idLiv", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idEmp", referencedColumnName = "id")
    )
    private Set<Emprunt> emprunts;

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
        emprunts = new HashSet<>();
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
     * @return Liste des emprunts
     */
    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    /**
     * @param emprunts permet de setter la liste des emprunts
     */
    public void setEmprunts(Set<Emprunt> emprunts) {
        emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", emprunts=" + emprunts +
                '}';
    }
}
