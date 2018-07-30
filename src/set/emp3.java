package set;

public class emp3  implements Comparable<emp3>
{

	int id;
	String name;
	String dept;
	
	
	
	
	public emp3(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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
	public int compareTo(emp3 e) 
	{
		if (this.id == e.getId()) {
            return 0;
        } else if (this.id < e.getId()) {
            return -1;
        }
        return 1;
	}




	@Override
	public String toString() {
		return "emp3 [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}



	 
}
