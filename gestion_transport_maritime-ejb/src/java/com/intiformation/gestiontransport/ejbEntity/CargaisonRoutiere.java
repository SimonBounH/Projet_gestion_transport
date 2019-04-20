package com.intiformation.gestiontransport.ejbEntity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IN-MP-005
 */
@Entity(name = "cargaisonRoutiere")
@Table(name = "cargaison_routieres")
@XmlRootElement
//@NamedQueries({ @NamedQuery(name = "getAllCompteCourant", query = "SELECT cc FROM compteCourant cc"),
//                @NamedQuery(name = "getByIdCompteCourant", query = "SELECT cc FROM compteCourant cc WHERE cc.idCompteBancaire = :id"),
//                @NamedQuery(name = "updateCompteCourant", query = "UPDATE compteCourant cc SET cc.numeroCompte = :NC, cc.solde = :solde, cc.decouvertAutorise = :DA WHERE cc.idCompteBancaire = :id"),
//                @NamedQuery(name = "deleteCompteCourant", query = "DELETE FROM compteCourant cc WHERE cc.idCompteBancaire = :id"),
//                @NamedQuery(name = "verifCompteCourant", query = "SELECT COUNT(cc.idCompteBancaire) FROM compteCourant cc WHERE cc.numeroCompte = :NC")
//})
public class CargaisonRoutiere extends Cargaison {

    //------------------------- Attributs ---------------------------------
    
    @Column(name = "temperature_de_conservation")
    private double temperatureDeConservation;


    //---------------------------- Ctors --------------------------
    public CargaisonRoutiere() {
    }

    public CargaisonRoutiere(double temperatureDeConservation, String reference, long distance, Date dateDeLivraison) {
        super(reference, distance, dateDeLivraison);
        this.temperatureDeConservation = temperatureDeConservation;
    }

    //------------------ Encapsulation ------------------------------------
    public double getTemperatureDeConservation() {
        return temperatureDeConservation;
    }

    public void setTemperatureDeConservation(double temperatureDeConservation) {
        this.temperatureDeConservation = temperatureDeConservation;
    }

    
    
}
