package p1;

public class Employee {

	
	private int id;
	private String name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public int doEmployeeThings()
	{
		return 0;
	}
	
	@Override
	public int hashCode() {
		// ---- 1000 line code
		
		System.out.println(" --->> Hashcode called for "+this.name+" & "+id);
		
		return id+name.length(); 
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println(" --->> Equals() called for "+this.name+" & "+id);
		
		boolean isEqual = false;
		if(obj instanceof Employee)
		{
			Employee secondEmp = (Employee)obj;
			
			boolean a = this.id == secondEmp.id;
			boolean b = this.name.equals(secondEmp.name);
			
			return a&&b;
			
		}
		else {
			 isEqual = false;
		}
		
			
			
		return isEqual;
	}
	

	


}//end class
























