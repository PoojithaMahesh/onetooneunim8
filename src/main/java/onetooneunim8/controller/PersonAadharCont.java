package onetooneunim8.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim8.dao.AadharCardDao;
import onetooneunim8.dao.PersonDao;
import onetooneunim8.dto.AadharCard;
import onetooneunim8.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(2);
//	person.setName("SIndhu");
//	person.setAddress("PUNE");
//	
//	PersonDao dao=new PersonDao();
//	dao.savePerson(person);
//	
	
	
	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(102);
//	aadharCard.setName("SindhuSharma");
//	aadharCard.setAge(20);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(2, aadharCard);
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setAge(19);
	aadharCard.setName("Sindhu");
	
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.updateAadharCard(102, aadharCard);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
