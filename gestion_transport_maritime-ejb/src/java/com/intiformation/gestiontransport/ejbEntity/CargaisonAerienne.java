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
@Entity(name = "cargaisonAerienne")
@Table(name = "cargaison_aeriennes")
@XmlRootElement
//@NamedQueries({ @NamedQuery(name = "getAllCompteEpargne", query = "SELECT ce FROM compteEpargne ce"),
//                @NamedQuery(name = "getByIdCompteEpargne", query = "SELECT ce FROM compteEpargne ce WHERE ce.idCompteBancaire = :id"),
//                @NamedQuery(name = "updateCompteEpargne", query = "UPDATE compteEpargne ce SET ce.numeroCompte = :NC, ce.solde = :solde, ce.taux = :taux WHERE ce.idCompteBancaire = :id"),
//                @NamedQuery(name = "deleteCompteEpargne", query = "DELETE FROM compteEpargne ce WHERE ce.idCompteBancaire = :id")
//})
public class CargaisonAerienne extends Cargaison {

    //------------------------- Attributs ---------------------------------
    
    @Column(name = "poids_max")
    private double poidsMax;


    //---------------------------- Ctors --------------------------
    public CargaisonAerienne() {
    }

    public CargaisonAerienne(double poidsMax, String reference, long distance, Date dateDeLivraison) {
        super(reference, distance, dateDeLivraison);
        this.poidsMax = poidsMax;
    }

    //------------------ Encapsulation ------------------------------------
    public double getPoidsMax() {
        return poidsMax;
    }

    public void setPoidsMax(double poidsMax) {
        this.poidsMax = poidsMax;
    }

    
    

}
