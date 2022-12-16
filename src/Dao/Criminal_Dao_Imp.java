package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean_Class.Criminal_information;
import Exception.CriminalException;
import Utility.DBUtil;

public class Criminal_Dao_Imp implements Criminal_Dao{

	@Override
	public String AddCriminal(Criminal_information criminalInfo) {
		// TODO Auto-generated method stub
		String msg = "Not Inserted ....";

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement(
					"insert into criminal (Criminal_name, Criminal_Age, Criminal_Gender, Address, Face_Id, Crime_Area, Crime_Name) "
							+ "values (?,?,?,?,?,?,?)");

			ps.setString(1, criminalInfo.getCrime_Name());
			ps.setInt(2, criminalInfo.getCriminal_Age());
			ps.setString(3, criminalInfo.getCriminal_Gender());
			ps.setString(4, criminalInfo.getAddress());
			ps.setString(5, criminalInfo.getFace_Id());
			ps.setString(6, criminalInfo.getCrime_Area());
			ps.setString(7, criminalInfo.getCrime_Name());

			int x = ps.executeUpdate();

			if (x > 0)
			{

				msg = "Criminal Added Sucessfully !";
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;	}

	@Override
	public List<Criminal_information> ViewCriminal() throws CriminalException {
		// TODO Auto-generated method stub
		List<Criminal_information> Criminals = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();){

			PreparedStatement ps = conn.prepareStatement("select * from criminal");

			ResultSet rs = ps.executeQuery();
			while (rs.next()){

				int id = rs.getInt("Criminal_id");
				String n = rs.getString("Criminal_Name");
				int a = rs.getInt("Criminal_Age");
				String g = rs.getString("Gender");
				String ad = rs.getString("Address");
				String fi = rs.getString("Face_Id");
				String area = rs.getString("Crime_Area");
				String cn = rs.getString("Crime_Name");

				Criminal_information cri = new Criminal_information(id, n, a, g, ad, fi, area, cn);

				Criminals.add(cri);

			}
		}
		catch (SQLException e){
			throw new CriminalException(e.getMessage());

		}

		if (Criminals.size() == 0) throw new CriminalException("No Criminal found..");

		return Criminals;
	}

	@Override
	public Criminal_information getcriminalByCId(int Cid) throws CriminalException {
		// TODO Auto-generated method stub
		Criminal_information criminal = null;

		try (Connection conn = DBUtil.provideConnection())
		{

			PreparedStatement ps = conn.prepareStatement("select * from criminal where Cid=?");

			ps.setInt(1, Cid);

			ResultSet rs = ps.executeQuery();

			if (rs.next()){
				int id = rs.getInt("Criminal_id");
				String n = rs.getString("Criminal_Name");
				int a = rs.getInt("Criminal_Age");
				String g = rs.getString("Criminal_Gender");
				String ad = rs.getString("Address");
				String fi = rs.getString("Face_Id");
				String area = rs.getString("Crime_Area");
				String cn = rs.getString("Crime_Name");

				criminal = new Criminal_information(id, n, a, g, ad, fi, area, cn);

			}
			else throw new CriminalException("Criminal does not exist with ID " + Cid);

		}
		catch (SQLException e)
		{

			e.printStackTrace();

			throw new CriminalException(e.getMessage());

		}

		return criminal;
	}

	@Override
	public String UpdateCriminal(Criminal_information criminalInfo) {
		// TODO Auto-generated method stub
		String msg = "Not Updated....";

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("update criminal set Cname=? where Cid=?");

			ps.setString(1, criminalInfo.getCrime_Name());
			ps.setInt(2, criminalInfo.getCriminal_id());
			ps.executeUpdate();

			msg = "Table Updated Successfully";

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return msg;
	}

	

}
