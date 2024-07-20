package inheritanceproject;

public class Manager extends Employee {
      String[] projects;
	  public Manager(int id, String name, String dept, double salary, String [] projects) {
		super(id, name, dept, salary);
		System.out.println("Inside manager constructor");
		this.projects=projects;
	}
    @Override
    public void work() {
	super.work();
	System.out.println( "Manger is managing  ");
	for(int i=0;i<projects.length;i++){
	System.out.println(projects[i]);
}
}
}