package Dao;

import java.util.List;

import Bean_Class.Criminal_information;
import Exception.CriminalException;

public interface Criminal_Dao {

	public  String AddCriminal(Criminal_information criminalInfo);

	public  List<Criminal_information> ViewCriminal() throws CriminalException;

	public  Criminal_information getcriminalByCId(int Cid) throws CriminalException;

	public  String UpdateCriminal(Criminal_information criminalInfo);

}
