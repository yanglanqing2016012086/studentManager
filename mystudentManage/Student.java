package mystudentManage;
 
public class Student {
	private int ID;
    private String name;
    private String birDate;
    private boolean gender;
    
    public Student() {
 
    }

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirDate() {
		return birDate;
	}

	public void setBirDate(String birDate) {
		this.birDate = birDate;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
    
}