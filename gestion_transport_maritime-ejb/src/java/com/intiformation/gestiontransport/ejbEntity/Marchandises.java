package com.intiformation.gestiontransport.ejbEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IN-MP-005
 */
@Entity(name = "marchandise")
@Table(name = "marchandises")
@XmlRootElement
//@NamedQueries({ @NamedQuery(name = "getAllClient", query = "SELECT c FROM client c"),
//                @NamedQuery(name = "getByIdClient", query = "SELECT c FROM client c WHERE c.idClient = :id"),
//                @NamedQuery(name = "updateClient", query = "UPDATE client c SET c.nom = :nom, c.prenom = :prenom, c.adresse = :adresse, c.codePostal = :codePostal, c.ville = :ville, c.telephone = :telephone WHERE c.idClient = :id"),
//                @NamedQuery(name = "deleteClient", query = "DELETE FROM client c WHERE c.idClient = :id")
//})
public class Marchandises {
    
    //------------------------- Attributs ---------------------------------
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero")
    private long numero;

    @Column(name = "nom")
    private String nom;

    @Column(name = "poids")
    private double poids;
    
    @Column(name = "volume")
    private double volume;
    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cargaison")
    private Cargaison cargaison;

    //---------------------------- Ctors --------------------------

    public Marchandises() {
    }

    public Marchandises(long numero, String nom, double poids, double volume) {
        this.numero = numero;
        this.nom = nom;
        this.poids = poids;
        this.volume = volume;
    }

    public Marchandises(String nom, double poids, double volume) {
        this.nom = nom;
        this.poids = poids;
        this.volume = volume;
    }

    public Marchandises(String nom, double poids, double volume, Cargaison cargaison) {
        this.nom = nom;
        this.poids = poids;
        this.volume = volume;
        this.cargaison = cargaison;
    }
    
    
    
    

    //------------------ Encapsulation ------------------------------------

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Cargaison getCargaison() {
        return cargaison;
    }

    public void setCargaison(Cargaison cargaison) {
        this.cargaison = cargaison;
    }
    
    
    
}
