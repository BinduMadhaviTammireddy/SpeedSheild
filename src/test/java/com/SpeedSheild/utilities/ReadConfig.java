package com.SpeedSheild.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	
	Properties properties; 
	public ReadConfig() 
	{
		File src= new File("./Configurations/config.properties");
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			properties =new Properties();
			properties.load(fis);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	
	
	public String getChromePath()
	{
		String ChromePath =properties.getProperty("ChromePath");
		return ChromePath;
	}

	public String getURL()
	{
		String Home_Url= properties.getProperty("Home_Url");
		return Home_Url;
	}
	public String getUsername_1()
	{
		String User_name_1= properties.getProperty("User_name_1");
		return User_name_1;
	}
	public String getPassword_1()
	{
		String Password_1= properties.getProperty("Password_1");
		return Password_1;
	}
	
	public String First_name()
	{
		String First_name= properties.getProperty("First_name");
		return First_name;
	}
	public String Last_name()
	{
		String Last_name= properties.getProperty("Last_name");
		return Last_name;
	}
	public String Personal_number_1()
	{
		String Personal_number_1= properties.getProperty("Personal_number_1");
		return Personal_number_1;
	}
	public String Personal_number_2()
	{
		String Personal_number_2= properties.getProperty("Personal_number_2");
		return Personal_number_2;
	}
	
}

