import java.util.ArrayList;

public class Classroom {
	
	private String name;
	private String department;
	private ArrayList<Appliance>appliances;
	public Classroom(String name, String department, ArrayList<Appliance> appliances) {
		super();
		this.name = name;
		this.department = department;
		this.appliances = appliances;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ArrayList<Appliance> getAppliances() {
		return appliances;
	}
	public void setAppliances(ArrayList<Appliance> appliances) {
		this.appliances = appliances;
	}
	
	public double calcClassConsumption() {
		double sum=0;
		for(int i=0;i<appliances.size();i++) {
			sum+=appliances.get(i).calcDailyConsumption();
		}
		return sum;
		
	}
	
	public ApplianceType findMaxApplianceType() {
		return null;
	
	}
	
}
