package com.jingjing.text;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Text {
public static void main(String[] args) {
	 //1.创建 EntityManagerFactory
    String persistenceUnitName = "jpa";
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
    
    //2.创建 EntityManager
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    //4.开启事务
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    
    //5.进行持久化操作
User user=new User("jingjing","123");
    
    entityManager.persist(user);
    
    //6.提交事务
    transaction.commit();
    
    //7.关闭 EntityManager
    entityManager.close();
    
    //8.关闭 EntityManagerFactory
    entityManagerFactory.close();
}
}
