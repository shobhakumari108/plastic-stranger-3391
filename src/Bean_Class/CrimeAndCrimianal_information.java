package Bean_Class;

public class CrimeAndCrimianal_information {

	private int CrimeId;
	private int CriminalId;
	
	@Override
	public String toString() {
		return "CrimeCrimianal_information [CrimeId=" + CrimeId + ", CriminalId=" + CriminalId + "]";
	}
	public CrimeAndCrimianal_information(int crimeId, int criminalId) {
		super();
		CrimeId = crimeId;
		CriminalId = criminalId;
	}
	public CrimeAndCrimianal_information() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCrimeId() {
		return CrimeId;
	}
	public void setCrimeId(int crimeId) {
		CrimeId = crimeId;
	}
	public int getCriminalId() {
		return CriminalId;
	}
	public void setCriminalId(int criminalId) {
		CriminalId = criminalId;
	}
	
	
	

}
