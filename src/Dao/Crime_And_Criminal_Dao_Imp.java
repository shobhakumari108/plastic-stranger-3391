package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean_Class.CrimeAndCrimianal_information;
import Bean_Class.Criminal_information;
import Exception.CriminalException;
import Utility.DBUtil;

public class Crime_And_Criminal_Dao_Imp implements Crime_And_Criminal_Dao{

	@Override
	public List<Criminal_information> CrimeFile(String Criminal_Name) throws CriminalException {
		// TODO Auto-generated method stub
		
			List<Criminal_information> Criminals = new ArrayList<>();

			try (Connection conn = DBUtil.provideConnection();)
			{

				PreparedStatement ps = conn.prepareStatement("select c.Criminal_Name, cr.Crime_Name from criminal"
						+ " c INNER JOIN crime cr INNER JOIN crime_criminal cc ON cc.Crime_id=cr.Crime_id "
						+ "AND cc.cid=c.cid AND cr.Crime_Name=?");

				//				***************
//				String Crime_Name = null;
				ps.setString(1, Criminal_Name);
//				***********************
				ResultSet rs = ps.executeQuery();
				while (rs.next())
				{

					Criminal_information cr = new Criminal_information();
					cr.setCrime_Name(rs.getString("Criminal_Name"));
					cr.setCrime_Name(rs.getString("Crime_Name"));

					Criminals.add(cr);

				}
			}
			catch (SQLException e)
			{
				throw new CriminalException(e.getMessage());

			}

			if (Criminals.size() == 0) throw new CriminalException("No Criminal crime found..");

			return Criminals;
	}

	@Override
	public String AddCriminalCrime(int Crime_id, int Criminal_id) {
		// TODO Auto-generated method stub
		String msg = "Not Inserted .....";
		try (Connection conn = DBUtil.provideConnection();)
		{

			PreparedStatement ps = conn.prepareStatement("insert into crime_criminal values(?,?)");
			ps.setInt(1, Crime_id);
			ps.setInt(2, Criminal_id);

			int x = ps.executeUpdate();

			if (x > 0)
			{
				msg = "Criminal crime added successfully !!";
			}
			else
			{
				msg = "Unable To add Record ...";
			}

		}
		catch (SQLException e)
		{
			msg = e.getMessage();
		}
		return msg;

	}

	@Override
	public String DeleteCriminal_crime(CrimeAndCrimianal_information crimeInfo) {
		// TODO Auto-generated method stub
		String msg = "Not Updated....";

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("DELETE FROM crime_Criminal WHERE Criminl_id=?");

			ps.setInt(1, crimeInfo.getCrimeId());
			ps.executeUpdate();

			msg = "Data deleted Successfully";

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return msg;

	}

	

}
