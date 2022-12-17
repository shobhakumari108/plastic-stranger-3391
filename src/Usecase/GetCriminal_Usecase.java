package Usecase;

import java.util.List;

import Bean_Class.Criminal_information;
import Dao.Criminal_Dao;
import Dao.Criminal_Dao_Imp;
import Exception.CriminalException;

public class GetCriminal_Usecase {
//************************************************
	public static void ViewCrimeRecord(){

		Criminal_Dao dao = new Criminal_Dao_Imp();

		try{
			List<Criminal_information> criminals = dao.ViewCriminal();

			criminals.forEach(s ->
			{

				System.out.println("Criminal Id -->" + s.getCriminal_id());
				System.out.println("Criminal name --> " + s.getCriminal_Name());
				System.out.println("Criminal Age --> " + s.getCriminal_Age());
				System.out.println("Criminal Gender --> " + s.getCriminal_Gender());
				System.out.println("Criminal Address --> " + s.getAddress());
				System.out.println("Criminal Face Mark --> " + s.getFace_Id());
				System.out.println("Criminal Crime Area --> " + s.getCrime_Area());
				System.out.println("Criminal Crime Name --> " + s.getCrime_Name());

				System.out.println("================================================");

				System.out.println();

			});

		}
		catch (CriminalException se){
			System.out.println(se.getMessage());
		}

	}

}
