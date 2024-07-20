package inheritanceproject;

public  class Tester extends Employee {
     public String [] tools;
     public Tester(int id, String name, String dept, double salary,String[]  tools) {
	 super(id,name,dept,salary);
     System.out.println("Inside tester constructor");
     this.tools= tools; 
	}
	@Override
    public void work() {
	super.work();
	System.out.println( "Tester is testing using ");
	for(int i=0;i<tools.length;i++){
	System.out.println(tools[i]);
    
}
}}

//public String [] tools;
//public Tester(int id, String name, String dept, double salary, String string) {
//super(id, name, dept, salary);
//System.out.println("Inside tester constructor");
//this.tools= string; //
