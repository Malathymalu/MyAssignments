package week3.day1;

public class Student1 {
	public void getStudentInfo(int id) {
	System.out.println("ID - " +id);	
	}
	
	public void getStudentInfo(int id,String name) {
	System.out.println("ID - " +id);
	System.out.println("Name - "+name);
	}
public void getStudentInfo(String email, long phno) {
	System.out.println("Email - "+email);
	System.out.println("Phone Number - "+ phno);

}
	public static void main(String[] args) {
		Student1 str = new Student1();
		str.getStudentInfo(32549);
		str.getStudentInfo(32549,"Malathy");
		str.getStudentInfo("malathymalu04@gmail.com", 7894564564l);
		

	}

}
