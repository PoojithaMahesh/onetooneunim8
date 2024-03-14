package onetooneunim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dto.Person;

public class PersonDao {
	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(person);
		entityTransaction.commit();
	}

	public void findPerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);

		if (dbPerson != null) {
//		id is present
			System.out.println(dbPerson);
		} else {
			System.out.println("Sorry Id is not present");
		}

	}

	public void updatePerson(int id, Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson != null) {
//		id is present 
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			person.setId(id);
			person.setAadharCard(dbPerson.getAadharCard());
//		person =id,name,addtess,aadharcard
			entityManager.merge(person);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry iD is not present");
		}

	}

	public void deletePerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person dbPerson = entityManager.find(Person.class, id);
		if (dbPerson != null) {
//	id is present
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(dbPerson);
        entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}

	}

}
