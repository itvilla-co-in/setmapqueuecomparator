package set;

public class emp 
{

	String name;
	String id;
	String dept;
	
	public emp(String name, String id, String dept) 
	{
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
	
	
	 
	 
	 
}
