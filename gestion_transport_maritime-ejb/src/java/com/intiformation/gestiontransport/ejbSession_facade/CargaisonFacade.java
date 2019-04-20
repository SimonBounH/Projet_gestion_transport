package com.intiformation.gestiontransport.ejbSession_facade;

import com.intiformation.gestiontransport.ejbEntity.Cargaison;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IN-MP-005
 */
@Stateless
public class CargaisonFacade extends AbstractFacade<Cargaison> {
    
    // Déclaration de l'EntityManager
    @PersistenceContext (unitName = "pu_db_gestion_transport_maritime")
    private EntityManager entityManager;
    
    public CargaisonFacade() {
        super(Cargaison.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    //__________________________________________________________________________
    //___________________METHODES PROPRES A L'ENTITE CARGAISON__________________
    //__________________________________________________________________________
    
}
