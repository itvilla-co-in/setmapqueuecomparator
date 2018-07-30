package objectcompare;

public class emp4  implements Comparable<emp4>
{

	int id;
	String name;
	String dept;
	int sal;
	int age;
	
	
	
	public emp4(int id, String name, String dept,int sal,int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.age = age;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getSal() {
		return sal;
	}




	public void setSal(int sal) {
		this.sal = sal;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}



	@Override
	public int compareTo(emp4 e) 
	{
           int byid = ((emp4) e).getId(); 
		   return this.id - byid;
	}




	@Override
	public String toString() {
		return "emp3 [id=" + id + ", name=" + name + ", dept=" + dept + "salary=" + sal + "age=" + age +"]";
	}



	 
}
