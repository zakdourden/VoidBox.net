package ejb;


import java.util.List;

 

import javax.ejb.Stateless;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import javax.persistence.TypedQuery;

import javax.persistence.criteria.CriteriaBuilder;

import javax.persistence.criteria.CriteriaQuery;

import javax.persistence.criteria.Root;

 

import entity.Account;

 

/**
*

*/

@Stateless

public class AccountBean  {

                @PersistenceContext(unitName = "VoidNetPersistenceUnit")

                private EntityManager em;

 

                public AccountBean  () {

                }

 

 

       public void create(Account entity) {

              em.persist(entity);

       }

 

       public void edit(Account entity) {

              em.merge(entity);

       }

 

       public Account find(Object id) {

              return em.find(Account.class, id);

       }

 

       public List<Account> findAll(boolean evict) {

              if(evict) em.getEntityManagerFactory().getCache().evictAll();

              javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();

              cq.select(cq.from(Account.class));

              return em.createQuery(cq).getResultList();

       }
}
