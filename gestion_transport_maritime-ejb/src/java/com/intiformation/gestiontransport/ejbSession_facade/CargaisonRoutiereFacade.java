package com.intiformation.gestiontransport.ejbSession_facade;

import com.intiformation.gestiontransport.ejbEntity.CargaisonRoutiere;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IN-MP-005
 */
@Stateless
public class CargaisonRoutiereFacade extends AbstractFacade<CargaisonRoutiere> {
    
    // Déclaration de l'EntityManager
    @PersistenceContext (unitName = "pu_db_gestion_transport_maritime")
    private EntityManager entityManager;
    
    public CargaisonRoutiereFacade() {
        super(CargaisonRoutiere.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
    
    //__________________________________________________________________________
    //___________________METHODES PROPRES A L'ENTITE CARGAISONROUTIERE__________
    //__________________________________________________________________________
    
}
