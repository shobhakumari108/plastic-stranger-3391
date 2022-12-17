package Usecase;

import java.util.Scanner;

import Bean_Class.CrimeAndCrimianal_information;
import Dao.Crime_And_Criminal_Dao;
import Dao.Crime_And_Criminal_Dao_Imp;

public class Delete_Crime_Criminal_Usecase {

	public static void DelectCrimeRecord()
	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Criminal id : ");
		int id = scanner.nextInt();

		Crime_And_Criminal_Dao dao = new Crime_And_Criminal_Dao_Imp();

		CrimeAndCrimianal_information crime = new CrimeAndCrimianal_information();

		crime.setCrimeId(id);
		

		String result = dao.DeleteCriminal_crime(crime);

		System.out.println(result);

	}

}
