public class Employee {
    private Name name;
    private int department;
    private int salary;
    private int id;
    private static int counter=1;
    public Employee(Name name, int department,int salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
        //count++;
        this.id=counter++;
    }
    public int getId() {
        return id;
    }
    /*public static void st(int) {
        int a=id;
        counter=0+a;
    }*/
/*
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }*/

    public Name getName(){
        return this.name;
    }
    public int getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return  this.salary;
    }
    public  void setSalary(int salary){
        this.salary=salary;
    }
    public  void setDepartment(int department){
        this.department=department;
    }

    @Override
    public String toString(){
        return name+" "+department+" "+salary+" ID: "+id;
    }


}
