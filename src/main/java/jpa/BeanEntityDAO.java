package jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created by Carlos Coves Prieto on 2/1/15.
 */
@Repository("beanEntityDAO")
@Transactional
public class BeanEntityDAO {

    @PersistenceContext
    private EntityManager em;

    public void addEntity(BeanEntity beanEntity) {
        em.persist(beanEntity);
    }

    public void deleteEntity(BeanEntity beanEntity) {
        em.remove(em.find(BeanEntity.class, beanEntity.getId()));
    }

    public void updateEntity(BeanEntity beanEntity) {
        em.merge(beanEntity);
    }

    public Collection<BeanEntity> listAll() {
        Query query = em.createQuery("select a from BeanEntity a");
        return query.getResultList();
    }

}
