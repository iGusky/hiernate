/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gusky
 */
public class HIbernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Persona p = new Persona();
        p.setClave("01");
        p.setNombre("Gustavo");
        p.setDireccion("San andres");
        p.setTelefono("123445646");
        
        session.save(p);
        
        transaction.commit();
        session.close();
        
    }
    
}
