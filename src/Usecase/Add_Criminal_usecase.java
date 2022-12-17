package Usecase;

import java.util.Scanner;

import Bean_Class.Criminal_information;
import Dao.Criminal_Dao;
import Dao.Criminal_Dao_Imp;

public class Add_Criminal_usecase {

	public static void Addcriminal()
	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Criminals Name: ");
		String name = scanner.next();

		System.out.println("Enter Criminals Age: ");
		int age = scanner.nextInt();

		System.out.println("Enter Criminals Gender: ");
		String gender = scanner.next();

		System.out.println("Enter Criminals Address : ");
		String address = scanner.next();

		System.out.println("Enter Criminals Face Identity Mark: ");
		String mark = scanner.next();

		System.out.println("Enter Criminals crime Area : ");
		String area = scanner.next();

		System.out.println("Enter Criminals crime  : ");
		String crime = scanner.next();

		Criminal_Dao dao = new Criminal_Dao_Imp();

		Criminal_information criminal = new Criminal_information();

		criminal.setCriminal_Name(name);
		criminal.setCriminal_Age(age);
		criminal.setCriminal_Gender(gender);
		criminal.setAddress(address);
		criminal.setFace_Id(mark);
		criminal.setCrime_Area(area);
		criminal.setCrime_Name(crime);

		String result = dao.AddCriminal(criminal);

		System.out.println(result);

	}

}
