package com.intiformation.gestiontransport.ejbEntity;

import com.intiformation.gestiontransport.ejbEntity.Cargaison;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-20T12:27:49")
@StaticMetamodel(Marchandises.class)
public class Marchandises_ { 

    public static volatile SingularAttribute<Marchandises, Double> volume;
    public static volatile SingularAttribute<Marchandises, Long> numero;
    public static volatile SingularAttribute<Marchandises, Double> poids;
    public static volatile SingularAttribute<Marchandises, String> nom;
    public static volatile SingularAttribute<Marchandises, Cargaison> cargaison;

}