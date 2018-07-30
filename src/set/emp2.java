package set;

public class emp2 
{

	String name;
	String id;
	String dept;
	
	public emp2(String name, String id, String dept) 
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
	
	
	 public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof emp2) {
	            emp2 pp = (emp2) obj;
	            return (pp.name.equals(this.name) && pp.id == this.id);
	        } else {
	            return false;
	        }
	    }
	
	  public int hashCode(){
	        System.out.println("In hashcode");
	        int hashcode = 0;
	        
	        hashcode += name.hashCode();
	        hashcode += id.hashCode();
	        return hashcode;
	    }
	 
	 
	 
	 
}
