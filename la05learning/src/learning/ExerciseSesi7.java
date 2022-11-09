package learning;

import java.time.LocalDateTime;
import java.util.ArrayList;

class Persona {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Persona(String name, String address, String phoneNumber, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getName();
	}
}

class Murid extends Persona {
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Murid(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getName();
	}
}

class Pegawai extends Persona {
	private String office;
	private String salary;
	private LocalDateTime recruitDate;

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public LocalDateTime getRecruitDate() {
		return recruitDate;
	}

	public void setRecruitDate(LocalDateTime recruitDate) {
		this.recruitDate = recruitDate;
	}

	public Pegawai(String name, String address, String phoneNumber, String email, String office, String salary,
			LocalDateTime recruitDate) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.recruitDate = recruitDate;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getName();
	}
}

class Dosen extends Pegawai {
	private String officeHours;
	private String academicPosition;

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getAcademicPosition() {
		return academicPosition;
	}

	public void setAcademicPosition(String academicPosition) {
		this.academicPosition = academicPosition;
	}

	public Dosen(String name, String address, String phoneNumber, String email, String office, String salary,
			LocalDateTime recruitDate, String officeHours, String academicPosition) {
		super(name, address, phoneNumber, email, office, salary, recruitDate);
		this.officeHours = officeHours;
		this.academicPosition = academicPosition;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getName();
	}
}

class Staff extends Pegawai {
	
	public Staff(String name, String address, String phoneNumber, String email, String office, String salary,
			LocalDateTime recruitDate) {
		super(name, address, phoneNumber, email, office, salary, recruitDate);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getName();
	}
}

public class ExerciseSesi7 {
	
	ArrayList<Staff> staffList = new ArrayList<>();
	ArrayList<Dosen> dosenList = new ArrayList<>();

	public ExerciseSesi7() {
		// TODO Auto-generated constructor stub
		Dosen newDosen = new Dosen("d1","Jakarta","02135678912","ABC1@email.com","Anggrek","5 million",LocalDateTime.of(2005,4,29,15,43,19),"07.00-19.00","Lecturer");
		Staff newStaff = new Staff("s1","Jakarta","02135678910","ABC2@email.com","Anggrek","2 million",LocalDateTime.of(2005,3,12,9,23,12));
		Staff newStaff1 = new Staff("s2","Jakarta","02135678911","ABC3@email.com","Anggrek","1 million",LocalDateTime.of(2006,3,12,12,25,01));
		staffList.add(newStaff); staffList.add(newStaff1); dosenList.add(newDosen);
		for(int i=0;i<staffList.size();i++) {
			System.out.println(staffList.get(i).toString());
		}
		System.out.println(" ");
		for(int i=0;i<dosenList.size();i++) {
			System.out.println(dosenList.get(i).toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ExerciseSesi7();
	}

}
