public class Main {
    private static Employee[] employee =new Employee[10];
    public static void main(String[] args) {
        giveNames();
        printAll();
        summarizeMonthSalary();
        averageValueSalary();
        foindMinMonthSalary();
        foindMaxMonthSalary();
        printNames();
    }
    public static void giveNames(){
        employee [0]=new Employee(new Name("Anatoly","Ananas"," Ananasovich"),1,56000);
        employee [1]=new Employee(new Name("Edward","Banana"," Bananaovich"),2,560000);
        employee [2]=new Employee(new Name("Pavel","Potato"," Potatoovich"),3,560);
        employee [3]=new Employee(new Name("Arkady","Сelery"," Сeleryovich"),4,56);
        employee [4]=new Employee(new Name("Mephisto","Cucumber2"," Cucumberovich"),5,56006);
        employee [5]=new Employee(new Name("Anatoly2.0","Ananas2"," Ananasovich"),1,560006);
        employee [6]=new Employee(new Name("Edward2.0","Banana2"," Bananaovich"),2,5600006);
        employee [7]=new Employee(new Name("Pavel2.0","Potato2"," Potatoovich"),3,5606);
        employee [8]=new Employee(new Name("Arkady2.0","Сelery2"," Сeleryovich"),4,566);
        employee [9]=new Employee(new Name("Mephisto2.0","Cucumber2"," Cucumberovich"),5,56006);
       }
    private static void printAll(){
        for (int i = 0; i < employee.length; i++)
        System.out.println(employee[i]);
    }
    private static void printNames(){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());
    }    }
    private static void summarizeMonthSalary(){
        int sum=0;
        for (int i=0; i<= employee.length-1;i++){
            sum=sum+employee[i].getSalary();}
        System.out.println("Employee salary costs: "+sum);
        }
    private static void averageValueSalary(){
        float sum=0;
        for (int i=0; i<= employee.length-1;i++){
            sum=sum+employee[i].getSalary();}
        float average=sum/ employee.length;
        System.out.println("Employee salary Average Value: "+average);
    }
    private static void foindMinMonthSalary(){
        int min=employee[0].getSalary();
        for (int i=1; i<= employee.length-1;i++){
            if (employee[i].getSalary()<min){
                min=employee[i].getSalary();
            }}
        System.out.println("Employee salary min: "+min);}
    private static void foindMaxMonthSalary(){
        int max=0;
        for (int i=0; i<= employee.length-1;i++){
            if (employee[i].getSalary()>max){
                max=employee[i].getSalary();
            }}
        System.out.println("Employee salary max: "+max);}

    }//исправила
