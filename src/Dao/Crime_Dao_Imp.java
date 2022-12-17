package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean_Class.Crime_information;
import Exception.CrimeException;
import Utility.DBUtil;

public  class Crime_Dao_Imp implements Crime_Dao{

	@Override
	public String AddCrime(Crime_information crimeInfo) {
		// TODO Auto-generated method stub
		String msg = "Not Insertd ....";
		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement(
					"insert into crime (Crime_date, Crime_place, Crime_name, Victims, Crime_Description, suspects)"
							+ "values (?,?,?,?,?,?)");

			ps.setString(1, crimeInfo.getCrime_Date());
			ps.setString(2, crimeInfo.getCrime_Place());
			ps.setString(3, crimeInfo.getCrime_name());
			ps.setString(4, crimeInfo.getVictims());
			ps.setString(5, crimeInfo.getCrime_Description());
			ps.setString(6, crimeInfo.getSuspects());

			int x = ps.executeUpdate();

			if (x > 0)
			{

				msg = "Crime Added Sucessfully !";
			}
		}
		catch (SQLException e)
		{

			e.printStackTrace();
			System.out.println(e.getMessage());

		}

		return msg;
	}

	@Override
	public List<Crime_information> ViewCrime() throws CrimeException {
		// TODO Auto-generated method stub
		List<Crime_information> Crime = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();)
		{

			PreparedStatement ps = conn.prepareStatement("select * from crime");

			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{

				int id = rs.getInt("crime_Id");
				String d = rs.getString("crime_date");
				String p = rs.getString("crime_place");
				String cn = rs.getString("Crime_name");
				String v = rs.getString("Victims");
				String cd = rs.getString("Crime_Description");
				String sp = rs.getString("suspects");
				String st = rs.getString("Status");

				Crime_information cri = new Crime_information(id, d, p, cn, v, cd, sp, st);

				Crime.add(cri);

			}
		}
		catch (SQLException e)
		{
			throw new CrimeException(e.getMessage());

		}

		if (Crime.size() == 0) throw new CrimeException("No crime found..");

		return Crime;
		
	}

	@Override
	public int statuscount(String s1) throws CrimeException {
		// TODO Auto-generated method stub
		int count = 0;

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("select count(*) from crime where status=?");
			ps.setString(1, s1);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{

				count = rs.getInt("count(*)");
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int Monthcount(String s1, String s2) throws CrimeException {
		// TODO Auto-generated method stub
		int count = 0;

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("select count(*) from crime where cdate between ? AND ?");
			ps.setString(1, s1);
			ps.setString(2, s2);

			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{

				count = rs.getInt("count(*)");
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return count;
		
	}

	@Override
	public List<Crime_information> CrimeArea(String s) throws CrimeException {
		// TODO Auto-generated method stub
		List<Crime_information> Crime = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("select * from crime where cplace=?");
//**********************
			
			ps.setString(1, s);
//			*****************************

			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				int id = rs.getInt("crime_Id");
				String d = rs.getString("crime_date");
				String p = rs.getString("crime_place");
				String cn = rs.getString("Crime_name");
				String v = rs.getString("Victims");
				String cd = rs.getString("Crime_Description");
				String sp = rs.getString("suspects");
				String st = rs.getString("Status");

				Crime_information cr = new Crime_information(id, d, p, cn, v, cd, sp, st);
				Crime.add(cr);

			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		if (Crime.size() == 0) throw new CrimeException("No crime found..");

		return Crime;
	}

	@Override
	public String UpdateCrime(Crime_information crimeInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
