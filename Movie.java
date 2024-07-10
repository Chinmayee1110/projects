package spring_ioc_container_No_XML;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Movie 
{
	@Id
	@Value(value="101")
	private int id;
	@Value(value = "Zhimma2")
	private String mname;
	@Value(value="5")
	private int rating;
	@Value(value = "400000000")
	private double budget;
	public int getId() 
	{
		return id;
	}
	public String getMname() 
	{
		return mname;
	}
	public int getRating() 
	{
		return rating;
	}
	public double getBudget() 
	{
		return budget;
	}
	
	

}
