package spring_ioc_container_No_XML;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Movie_Driver {

	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
		Movie movie= context.getBean(Movie.class,"movie");
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
		transaction.begin();
		manager.persist(movie);
		transaction.commit();

		System.out.println(movie.getId());
		System.out.println(movie.getMname());
		System.out.println(movie.getRating());
		System.out.println(movie.getBudget());

	}

}
