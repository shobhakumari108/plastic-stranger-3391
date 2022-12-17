package Usecase;

import java.util.List;

import Bean_Class.Crime_information;
import Dao.Crime_Dao;
import Dao.Crime_Dao_Imp;
import Exception.CrimeException;

public class GetCrime_Usecase {

	public static void ViewCrimeRecord(){

		Crime_Dao dao = new Crime_Dao_Imp();

		try{
			List<Crime_information> criminals = dao.ViewCrime();

			criminals.forEach(s ->
			{

				System.out.println("Crime Id :" + s.getCrime_Id());
				System.out.println("Crime Date : " + s.getCrime_Date());
				System.out.println("Crime Place: " + s.getCrime_Place());
				System.out.println("Crime Name: " + s.getCrime_name());
				System.out.println("Crime Victims: " + s.getVictims());
				System.out.println("Crime Description: " + s.getCrime_Description());
				System.out.println("Crime Suspected name : " + s.getSuspects());
				System.out.println("Crime Case Status: " + s.getStatus());

				System.out.println("================================================");

				System.out.println();

			});

		}
		catch (CrimeException se)
		{
			System.out.println(se.getMessage());
		}

	}
}
