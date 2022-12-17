package Usecase;

import java.util.Scanner;

import Dao.Crime_Dao;
import Dao.Crime_Dao_Imp;
import Exception.CrimeException;

public class GetCrime_Status_Count_Usecase {

	public static void countSovingCases(){
		Crime_Dao dao = new Crime_Dao_Imp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of Case status");
		String s1 = scanner.next();

		try{
			int c = dao.statuscount(s1);
			System.out.println("Total Number of Resolved/Unresolved Cases : " + c);

		}
		catch (CrimeException e)
		{
			e.printStackTrace();
		}
	}
}
