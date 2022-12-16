package Dao;

import java.util.List;

import Bean_Class.CrimeAndCrimianal_information;
import Bean_Class.Criminal_information;
import Exception.CriminalException;

public interface Crime_And_Criminal_Dao {
	public List<Criminal_information> CrimeFile(String Criminal_Name) throws CriminalException;

	public String AddCriminalCrime(int Crime_id, int Criminal_id);

	public String DeleteCriminal_crime(CrimeAndCrimianal_information crimeInfo);
	

}
