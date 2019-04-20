package com.intiformation.gestiontransport.ejbEntity;

import com.intiformation.gestiontransport.ejbEntity.Marchandises;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-20T12:27:49")
@StaticMetamodel(Cargaison.class)
public abstract class Cargaison_ { 

    public static volatile SingularAttribute<Cargaison, String> reference;
    public static volatile SingularAttribute<Cargaison, Long> distance;
    public static volatile SingularAttribute<Cargaison, Integer> idCargaison;
    public static volatile ListAttribute<Cargaison, Marchandises> marchandises;
    public static volatile SingularAttribute<Cargaison, Date> dateDeLivraison;

}