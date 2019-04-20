package com.intiformation.gestiontransport.ejbEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IN-MP-005
 */
@Entity(name = "cargaison")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_cargaison",
        discriminatorType = DiscriminatorType.STRING
)
@Table(name = "cargaisons")
@XmlRootElement
public abstract class Cargaison implements Serializable {

    //------------------------- Attributs ---------------------------------
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargaison")
    private int idCargaison;

    @Column(name = "reference")
    private String reference;

    @Column(name = "distance")
    private long distance;
    
    @Column(name = "date_de_livraison")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeLivraison;
    
    @OneToMany(mappedBy = "cargaison", cascade = CascadeType.ALL)
    private List<Marchandises> marchandises;


    //---------------------------- Ctors --------------------------
    public Cargaison() {
    }
    

    public Cargaison(int idCargaison, String reference, long distance, Date dateDeLivraison) {
        this.idCargaison = idCargaison;
        this.reference = reference;
        this.distance = distance;
        this.dateDeLivraison = dateDeLivraison;
    }

    public Cargaison(String reference, long distance, Date dateDeLivraison) {
        this.reference = reference;
        this.distance = distance;
        this.dateDeLivraison = dateDeLivraison;
    }

    //------------------ Encapsulation ------------------------------------

    public int getIdCargaison() {
        return idCargaison;
    }

    public void setIdCargaison(int idCargaison) {
        this.idCargaison = idCargaison;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public Date getDateDeLivraison() {
        return dateDeLivraison;
    }

    public void setDateDeLivraison(Date dateDeLivraison) {
        this.dateDeLivraison = dateDeLivraison;
    }

    public List<Marchandises> getMarchandises() {
        return marchandises;
    }

    public void setMarchandises(List<Marchandises> marchandises) {
        this.marchandises = marchandises;
    }

    
    
    

}
