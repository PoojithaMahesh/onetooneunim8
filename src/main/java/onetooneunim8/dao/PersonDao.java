package onetooneunim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dto.Person;

public class PersonDao {
public void savePerson(Person person) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	
	entityManager.persist(person);
	entityTransaction.commit();
}

public void findPerson(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Person dbPerson=entityManager.find(Person.class, id);
	
	if(dbPerson!=null) {
//		id is present
		System.out.println(dbPerson);
	}else {
		System.out.println("Sorry Id is not present");
	}
	
	
}






}
