package Usecase;

import java.util.Scanner;

import Dao.Crime_And_Criminal_Dao;
import Dao.Crime_And_Criminal_Dao_Imp;

public class Add_Crime_Criminal_Record_Usecase {

	public static void AddCriminalCrime()
	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Crime Id : ");
		int crimeid = scanner.nextInt();

		System.out.println("Enter Criminal Id : ");
		int cid = scanner.nextInt();

	Crime_And_Criminal_Dao dao = new Crime_And_Criminal_Dao_Imp();

		String res = dao.AddCriminalCrime(crimeid, cid);
		System.out.println(res);

	}
}
