package onetooneunim8.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dto.AadharCard;
import onetooneunim8.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
	Person person=new Person();
	person.setId(1);
	person.setName("Prem");
	person.setAddress("PUNE");
	
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(101);
	aadharCard.setName("PremMadhuri");
	aadharCard.setAge(18);
	
	
	person.setAadharCard(aadharCard);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(aadharCard);
	entityManager.persist(person);
	entityTransaction.commit();
	
	
	
}
}
