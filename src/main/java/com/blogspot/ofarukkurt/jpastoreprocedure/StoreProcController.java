package com.blogspot.ofarukkurt.jpastoreprocedure;

import com.blogspot.ofarukkurt.jpastoreprocedure.models.TblStok;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author Omer Faruk Kurt
 * @Created on date 28/08/2018 14:10:16
 */
public class StoreProcController implements java.io.Serializable {

    private static final long serialVersionUID = -7676679047094669048L;
    private static final Logger LOG = Logger.getLogger(StoreProcController.class.getName());

    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("STORE_PU");
            EntityManager em = emf.createEntityManager();

            StoredProcedureQuery query = em.createStoredProcedureQuery("stokKartiGetir", TblStok.class)
                    .registerStoredProcedureParameter("stokId", Integer.class, ParameterMode.IN)
                    .setParameter("stokId", 194);
            TblStok stok = (TblStok) query.getSingleResult();
            if (stok != null) {
                System.out.println("stokAd:" + stok.getStokAd());
                System.out.println("stokKod:" + stok.getStokKod());
            }
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }
}
