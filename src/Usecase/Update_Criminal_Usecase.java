package Usecase;

import java.util.Scanner;

import Bean_Class.Criminal_information;
import Dao.Criminal_Dao;
import Dao.Criminal_Dao_Imp;

public class Update_Criminal_Usecase {

	public static void Updatecriminal(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Name: ");
		String name = scanner.next();

		System.out.println("Enter the Cid: ");
		int id = scanner.nextInt();

		Criminal_Dao dao = new Criminal_Dao_Imp();

		Criminal_information criminal = new Criminal_information();

		criminal.setCriminal_Name(name);
		criminal.setCriminal_id(id);

		String result = dao.UpdateCriminal(criminal);

		System.out.println(result);

	}
}
