public class Name {//не нужен, но раз уж написала то пусть будет
    private String firstName;
    private String secondName;
    private String threeName;
    public Name(String firstName,String secondName, String threeName){
        this.firstName=firstName;
        this.secondName= secondName;
        this.threeName= threeName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getThreeName(){
        return threeName;
    }
    @Override
    public String toString(){
        return firstName+" "+secondName+" "+threeName;
    }
}
