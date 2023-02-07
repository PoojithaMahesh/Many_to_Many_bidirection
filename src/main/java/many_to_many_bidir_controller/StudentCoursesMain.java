package many_to_many_bidir_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_bidir_dto.Courses;
import many_to_many_bidir_dto.Students;

public class StudentCoursesMain {
public static void main(String[] args) {
	 Students students1=new Students();
	 students1.setId(1);
	 students1.setName("poojitha");
	 students1.setPhone(234234);
	 
	 Students students2=new Students();
	 students2.setId(2);
	 students2.setName("kavya");
	 students2.setPhone(999999);
	 
	 Students students3=new Students();
	 students3.setId(3);
	 students3.setName("sharath");
	 students3.setPhone(9999999);
	 
	 
	 Courses courses1=new Courses();
	 courses1.setId(101);
	 courses1.setName("java");
	 courses1.setDurations("2 mon");
	 
	 Courses courses2=new Courses();
	 courses2.setId(102);
	 courses2.setName("adv java");
	 courses2.setDurations("1.4 mon");
	 
	 Courses courses3=new Courses();
	 courses3.setId(103);
	 courses3.setName("sql");
	 courses3.setDurations("1 mon");
	 
	 List<Students> list1=new ArrayList <Students>();
	 list1.add(students1);
	 list1.add(students2);
	 
	 List<Students> list2=new ArrayList <Students>();
	 list1.add(students1);
	 list1.add(students2);
	 list1.add(students3);
	 
	 List<Students> list3=new ArrayList <Students>();
	 list1.add(students3);
	
	 
	 List<Courses> listc1=new ArrayList <Courses>();
	 listc1.add(courses1);
	 listc1.add(courses2);
	 
	 List<Courses> listc2=new ArrayList <Courses>();
	 listc2.add(courses1);
	 listc2.add(courses2);
	 listc2.add(courses3);
	 
	 students1.setList(listc1);
	 students2.setList(listc1);
	 students3.setList(listc2);
	 
	 courses1.setList(list2);
	 courses2.setList(list1);
	 courses3.setList(list3);
	 
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	 EntityManager entityManager=entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.persist(courses3);
	 entityManager.persist(courses2);
	 entityManager.persist(courses1);
	 entityManager.persist(students1);
	
	 entityManager.persist(students2);
	 entityManager.persist(students3);
	 
	 entityTransaction.commit();
	 
	 
	 
	 
	 
	 
}
}
