package Bean_Class;

public class Criminal_information {
	private int Criminal_id;
	private	String  Criminal_Name;
	private int Criminal_Age;
	private String Criminal_Gender;
	private String Address;
	private String Face_Id;
	private String Crime_Area;
	private String Crime_Name;


	public Criminal_information() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Criminal_information [Criminal_id=" + Criminal_id + ", Criminal_Name=" + Criminal_Name
				+ ", Criminal_Age=" + Criminal_Age + ", Criminal_Gender=" + Criminal_Gender + ", Address=" + Address
				+ ", Face_Id=" + Face_Id + ", Crime_Area=" + Crime_Area + ", Crime_Name=" + Crime_Name + "]";
	}


	public Criminal_information(int criminal_id, String criminal_Name, int criminal_Age, String criminal_Gender,
			String address, String face_Id, String crime_Area, String crime_Name) {
		super();
		Criminal_id = criminal_id;
		Criminal_Name = criminal_Name;
		Criminal_Age = criminal_Age;
		Criminal_Gender = criminal_Gender;
		Address = address;
		Face_Id = face_Id;
		Crime_Area = crime_Area;
		Crime_Name = crime_Name;
	}


	public int getCriminal_id() {
		return Criminal_id;
	}


	public void setCriminal_id(int criminal_id) {
		Criminal_id = criminal_id;
	}


	public String getCriminal_Name() {
		return Criminal_Name;
	}


	public void setCriminal_Name(String criminal_Name) {
		Criminal_Name = criminal_Name;
	}


	public int getCriminal_Age() {
		return Criminal_Age;
	}


	public void setCriminal_Age(int criminal_Age) {
		Criminal_Age = criminal_Age;
	}


	public String getCriminal_Gender() {
		return Criminal_Gender;
	}


	public void setCriminal_Gender(String criminal_Gender) {
		Criminal_Gender = criminal_Gender;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getFace_Id() {
		return Face_Id;
	}


	public void setFace_Id(String face_Id) {
		Face_Id = face_Id;
	}


	public String getCrime_Area() {
		return Crime_Area;
	}


	public void setCrime_Area(String crime_Area) {
		Crime_Area = crime_Area;
	}


	public String getCrime_Name() {
		return Crime_Name;
	}


	public void setCrime_Name(String crime_Name) {
		Crime_Name = crime_Name;
	}
	

}
