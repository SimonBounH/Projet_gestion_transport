package com.intiformation.gestiontransport.ejbSession_facade;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author IN-MP-005
 */
public abstract class AbstractFacade<T> {
    
    //_________________________PROPRIETES____________________________________
    // Déclaration de l'entité
    private Class<T> entity;

    //_________________________CONSTRUCTEURS____________________________________
    /**
     * CSTR 1 : Constructeur chargé pour initialiser l'entité
     *
     * @param entity
     */
    public AbstractFacade(Class<T> entity) {
        this.entity = entity;
    }

    //____________________________METHODES____________________________________
    
    //Méthodes abstraites
    /**
     * Permet de récupérer une EntityManager
     * On reporte l'initialisation de l'EM à la classe concrète
     * @return 
     */
    protected abstract EntityManager getEntityManager();
    
    //Méthodes concrètes
    
    /**
     * Ajout d'une entité dans la BDD
     */
    public void add(T t) {
        getEntityManager().persist(t);
    }
    
    /**
     * Permet de modifier une entité dans la BDD
     * @param t 
     */
    public void update(T t) {
        getEntityManager().merge(t);
    }
    
    /**
     * Permet de supprimer une entité dans la BDD
     * @param t 
     */
    public void delete (T t) {
        getEntityManager().remove(t);
    } 
    
    public List<T> findAll(){
        
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root from = criteriaQuery.from(entity);
        CriteriaQuery select = criteriaQuery.select(from);
        
        return getEntityManager().createQuery(select).getResultList();
        
    }
    
//    /**
//     * Compter le nombre d'entités dans la BDD
//     * Implémentation avec l'API Criteria
//     * @return 
//     */
//    public long count(){
//        
//        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
//        CriteriaQuery query = builder.createQuery();
//        Root from = query.from(entity);
//        query.select(builder.count(from));
//        
//        Query requeteJpa = getEntityManager().createQuery(query);
//        
//        return (long) requeteJpa.getSingleResult();
//        
//    }
    
}
