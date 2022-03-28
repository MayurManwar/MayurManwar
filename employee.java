package Bank;

class emp
{
	String emp_name, emp_add;
	int emp_no, emp_mobile_no, emp_id;
	
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public String getEmp_add() {
		return emp_add;
	}
	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}

	public int getEmp_mobile_no() {
		return emp_mobile_no;
	}
	public void setEmp_mobile_no(int emp_mobile_no) {
		this.emp_mobile_no = emp_mobile_no;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String toString() {
		return "emp [emp_name=" + emp_name + ", emp_add=" + emp_add + ", emp_no=" + emp_no + ", emp_mobile_no="
				+ emp_mobile_no + ", emp_id=" + emp_id + "]";
	}
	
}



public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp oemp =new emp();
		
		oemp.setEmp_name("Mayur");
		
		
		oemp.setEmp_id(577);
		
		
		oemp.setEmp_add("Akola");
		
		
		oemp.setEmp_mobile_no(787866);
	
	
		System.out.println(oemp.getEmp_name()+" "+ oemp.getEmp_id()+" "+oemp.getEmp_add()+" "+oemp.getEmp_mobile_no());
	}
	}


