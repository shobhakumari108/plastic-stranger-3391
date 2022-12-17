package Usecase;

import java.util.Scanner;

import Bean_Class.Criminal_information;
import Dao.Criminal_Dao;
import Dao.Criminal_Dao_Imp;
import Exception.CriminalException;

public class GetCriminal_By_Criminal_id_Usecase {

	public static void ViewCriminalById(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Criminal Id");
		int id = scanner.nextInt();

		Criminal_Dao dao = new Criminal_Dao_Imp();

		try{
			Criminal_information criminal = dao.getcriminalByCId(id);

			System.out.println("Criminal Id -->" + criminal.getCriminal_id());
			System.out.println("Criminal name --> " + criminal.getCriminal_Name());
			System.out.println("Criminal Age --> " + criminal.getCriminal_Age());
			System.out.println("Criminal Gender --> " + criminal.getCriminal_Gender());
			System.out.println("Criminal Address --> " + criminal.getAddress());
			System.out.println("Criminal Face Mark --> " + criminal.getFace_Id());
			System.out.println("Criminal Crime Area --> " + criminal.getCrime_Area());
			System.out.println("Criminal Crime Name --> " + criminal.getCrime_Name());

			System.out.println();

			System.out.println();

		}catch (CriminalException e){
			e.printStackTrace();
		}

	}
}
