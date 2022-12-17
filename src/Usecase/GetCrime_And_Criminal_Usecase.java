package Usecase;

import java.util.List;
import java.util.Scanner;

import Bean_Class.Criminal_information;
import Dao.Crime_And_Criminal_Dao;
import Dao.Crime_And_Criminal_Dao_Imp;
import Exception.CriminalException;

public class GetCrime_And_Criminal_Usecase {

	public static void CriminalCrimeRecord()
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Crime Name : ");

		String cr = scanner.next();

		Crime_And_Criminal_Dao dao = new Crime_And_Criminal_Dao_Imp();

		try
		{
			List<Criminal_information> criminals = dao.CrimeFile(cr);

			criminals.forEach(s ->
			{

				System.out.println("Criminal name --> " + s.getCriminal_Name());
				System.out.println("Crime Commited by Criminal is --> " + s.getCrime_Name());

				System.out.println("================================================");

				System.out.println();

			});

		}
		catch (CriminalException se)
		{
			System.out.println(se.getMessage());
		}

	}

}
