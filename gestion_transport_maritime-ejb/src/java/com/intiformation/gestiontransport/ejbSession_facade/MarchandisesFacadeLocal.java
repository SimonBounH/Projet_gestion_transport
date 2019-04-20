package com.intiformation.gestiontransport.ejbSession_facade;

import com.intiformation.gestiontransport.ejbEntity.Marchandises;
import java.util.List;

/**
 *
 * @author IN-MP-005
 */
public interface MarchandisesFacadeLocal {
    
    public void add(Marchandises marchandises);

    public void update(Marchandises marchandises);

    public void delete (Marchandises marchandises);
    
    public List<Marchandises> findAll();
        
  
}
