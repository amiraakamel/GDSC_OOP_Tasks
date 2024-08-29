public class Employee {
    private static int id =0;
    private String firstName;
    private String lastName;
    private int salary;


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+ " "+ lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(int salary){
        return salary*12;
    }

    public int raiseSalary(int percent){
        return salary+(salary*(percent/100));
    }

    public String toString(){
        return "Employee[id="+id+",name="+getName()+",salary="+salary+"]";
    }

}
