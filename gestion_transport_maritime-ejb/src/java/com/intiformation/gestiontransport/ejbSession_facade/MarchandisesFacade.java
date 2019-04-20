package com.intiformation.gestiontransport.ejbSession_facade;

import com.intiformation.gestiontransport.ejbEntity.Marchandises;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IN-MP-005
 */
@Stateless
public class MarchandisesFacade extends AbstractFacade<Marchandises> implements MarchandisesFacadeLocal {
    
    // Déclaration de l'EntityManager
    @PersistenceContext (unitName = "pu_db_gestion_transport_maritime")
    private EntityManager entityManager;
    
    public MarchandisesFacade() {
        super(Marchandises.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    //__________________________________________________________________________
    //___________________METHODES PROPRES A L'ENTITE MARCHANDISES8______________
    //__________________________________________________________________________
    
    
    
    
}
