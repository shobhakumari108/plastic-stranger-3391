package Usecase;

import java.util.Scanner;

import Bean_Class.Crime_information;
import Dao.Crime_Dao;
import Dao.Crime_Dao_Imp;

public class Status_Update_Usecase {

	public static void UpdateCaseStatus(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Update Case Status to Resolved/Unresolved6: ");
		String Status = scanner.next();

		System.out.println("Enter the crimId: ");
		int id = scanner.nextInt();

		Crime_Dao dao = new Crime_Dao_Imp();

		Crime_information crime = new Crime_information();

		crime.setStatus(Status);
		
		crime.setCrime_Id(id);
		

		String result = dao.UpdateCrime(crime);

		System.out.println(result);
	}
}
