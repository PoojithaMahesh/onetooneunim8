package onetooneunim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dto.AadharCard;
import onetooneunim8.dto.Person;

public class AadharCardDao {

	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//		that person is present so i can issue the Adharcard
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
//			save the adharcard
			entityManager.persist(aadharCard);
//			update the person details
			dbPerson .setAadharCard(aadharCard);
			
			entityTransaction.commit();
			
		}else {
//			not valid person
			System.out.println("Sorry ID is not present/Person is not present");
		}
	}
	
	
	
	public void findAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present
			System.out.println(dbAadharCard);
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present so i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry Id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
}
