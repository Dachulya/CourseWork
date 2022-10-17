public class Main {
    static Employee[] employee =new Employee[5];
    public static void main(String[] args) {
        giveNames();

    }
    public static void giveNames(){
        for (int i=0; i<= employee.length-1;i++){
            employee [0]=new Employee(new Name("Anatoly","Ananas"," Ananasovich"),1,56000);
            employee [1]=new Employee(new Name("Edward","Banana"," Bananaovich"),2,560000);
            employee [2]=new Employee(new Name("Pavel","Potato"," Potatoovich"),3,560);
            employee [3]=new Employee(new Name("Arkady","Сelery"," Сeleryovich"),4,56);
            employee [4]=new Employee(new Name("Mephisto","Cucumber"," Cucumberovich"),5,5600);
            //System.out.println(employee[i].getName());
            System.out.println(employee[i]);

        }
        System.out.println();
        }

    }
