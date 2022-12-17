package Usecase;

import java.util.Scanner;

import Bean_Class.Crime_information;
import Dao.Crime_Dao;
import Dao.Crime_Dao_Imp;

public class Add_Crime_Usecase {

	public static void AddCrimeRecord()
	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Crime Date in YYYY-MM-DD Format: ");
		String date1 = scanner.nextLine();

		System.out.println("Enter Crime Place : ");
		String place = scanner.nextLine();

		System.out.println("Enter crime Name : ");
		String crime = scanner.nextLine();

		System.out.println("Enter Victims Name : ");
		String victim = scanner.nextLine();

		System.out.println("Enter Detail Description of crime: ");
		String desc = scanner.nextLine();

		System.out.println("Enter Crime Suspect's name : ");
		String suspect = scanner.nextLine();

		Crime_Dao dao1 = new Crime_Dao_Imp();

		Crime_information crime1 = new Crime_information();

		crime1.setCrime_Date(date1);
		crime1.setCrime_Place(place);
		crime1.setCrime_name(crime);
		crime1.setVictims(victim);
		
		crime1.setCrime_Description(desc);
		crime1.setSuspects(suspect);

		String result = dao1.AddCrime(crime1);

		System.out.println(result);

	}

}
