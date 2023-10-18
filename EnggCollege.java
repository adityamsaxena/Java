class Student{
	String name;
	int Id;
	String Branch;
}
class EnggCollege{
	public static void main(String[]args){
	 	Student s1 = new Student();
			s1.name = "Aditya Saxena";
			s1.Id = 1007;
			s1.Branch = "CSE";

			System.out.println(s1.name + s1.Id + s1.Branch);
	}
}