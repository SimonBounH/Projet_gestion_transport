package com.intiformation.gestiontransport.managedBean;

import com.intiformation.gestiontransport.ejbEntity.Marchandises;
import com.intiformation.gestiontransport.ejbSession_facade.MarchandisesFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author IN-MP-005
 */
@Named(value = "gestionTransportMB")
@SessionScoped
public class GestionTransportMB implements Serializable {
    
    //_________________________PROPRIETES_______________________________________
    @EJB
    private MarchandisesFacadeLocal marchandisesBean;
    
    private List<Marchandises> listeMarchandises;
    

    //_________________________CONSTRUCTEURS____________________________________
    public GestionTransportMB() {
    }
    
    
    //______________________________METHODES____________________________________
     
    
    
    
    
    
    
    
    
    
    //_________________________ENCAPSULATION____________________________________

    

    public MarchandisesFacadeLocal getMarchandisesBean() {
        return marchandisesBean;
    }

    public List<Marchandises> getListeMarchandises() {
        return marchandisesBean.findAll();
    }

    public void setListeMarchandises(List<Marchandises> listeMarchandises) {
        this.listeMarchandises = listeMarchandises;
    }
    
    
    
    
    
}
