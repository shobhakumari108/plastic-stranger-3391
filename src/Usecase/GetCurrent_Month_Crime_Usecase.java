package Usecase;

import java.util.Scanner;

import Dao.Crime_Dao;
import Dao.Crime_Dao_Imp;
import Exception.CrimeException;

public class GetCurrent_Month_Crime_Usecase {

	public static void OneMonthCrime(){
		Crime_Dao dao = new Crime_Dao_Imp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  StartDate in YYYY-MM-DD :");
		String s1 = scanner.next();
		System.out.println("Enter the EndDate in YYYY-MM-DD : ");
		String s2 = scanner.next();

		try{
			int c = dao.Monthcount(s1, s2);
			System.out.println("Number of crimes recorded in the current month : " + c);

		}
		catch (CrimeException e)
		{
			e.printStackTrace();
		}
	}
}
