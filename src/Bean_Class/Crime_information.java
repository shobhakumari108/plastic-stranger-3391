package Bean_Class;

public class Crime_information {
	private int Crime_Id;
	private String Crime_Date;
	private String Crime_Place;
	private String Crime_name;
	private String Victims;
	private String Crime_Description;
	private String Suspects;
	private String Status;
	
	

	@Override
	public String toString() {
		return "Crime_information [Crime_Id=" + Crime_Id + ", Crime_Date=" + Crime_Date + ", Crime_Place=" + Crime_Place
				+ ", Crime_name=" + Crime_name + ", Victims=" + Victims + ", Crime_Description=" + Crime_Description
				+ ", Suspects=" + Suspects + ", Status=" + Status + "]";
	}



	public Crime_information() {
		// TODO Auto-generated constructor stub
	}



	public Crime_information(int crime_Id, String crime_Date, String crime_Place, String crime_name, String victims,
			String crime_Description, String suspects, String status) {
		super();
		Crime_Id = crime_Id;
		Crime_Date = crime_Date;
		Crime_Place = crime_Place;
		Crime_name = crime_name;
		Victims = victims;
		Crime_Description = crime_Description;
		Suspects = suspects;
		Status = status;
	}



	public int getCrime_Id() {
		return Crime_Id;
	}



	public void setCrime_Id(int crime_Id) {
		Crime_Id = crime_Id;
	}



	public String getCrime_Date() {
		return Crime_Date;
	}



	public void setCrime_Date(String crime_Date) {
		Crime_Date = crime_Date;
	}



	public String getCrime_Place() {
		return Crime_Place;
	}



	public void setCrime_Place(String crime_Place) {
		Crime_Place = crime_Place;
	}



	public String getCrime_name() {
		return Crime_name;
	}



	public void setCrime_name(String crime_name) {
		Crime_name = crime_name;
	}



	public String getVictims() {
		return Victims;
	}



	public void setVictims(String victims) {
		Victims = victims;
	}



	public String getCrime_Description() {
		return Crime_Description;
	}



	public void setCrime_Description(String crime_Description) {
		Crime_Description = crime_Description;
	}



	public String getSuspects() {
		return Suspects;
	}



	public void setSuspects(String suspects) {
		Suspects = suspects;
	}



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}
	

}
