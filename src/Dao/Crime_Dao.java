package Dao;

import java.util.List;


import Bean_Class.Crime_information;
import Exception.CrimeException;

public interface Crime_Dao {

	public String AddCrime(Crime_information crimeInfo);
	
	public List<Crime_information> ViewCrime() throws CrimeException;
	
	public int statuscount(String s1) throws CrimeException;

	public int Monthcount(String s1, String s2) throws CrimeException;

	public List<Crime_information> CrimeArea(String s) throws CrimeException;

	public String UpdateCrime(Crime_information crimeInfo);
}
