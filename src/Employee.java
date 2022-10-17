public class Employee {
    private Name name;
    private int department;
    private int salary;

    private int count=0;
    public Employee(Name name, int department,int salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
        count++;
    }
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

    @Override
    public String toString(){
        return name+" "+department+" "+salary;
    }


}
