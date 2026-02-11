public class Employee {
    private static int counter = 1;
    private String firstName; //имя
    private String lastName; //фамилия
    private String middleName; //отчество
    private int department; //отдел
    private int salary; //зарплата
    private int id;

    public Employee(String firstName, String lastName, String middleName, int department, int salary) {
        this.id = counter;
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public String toString() {
        return "Фамилия " + lastName
                + ", Имя " + firstName
                + ", Отчество " + middleName
                + ", отдел " + department
                + ", зарплата " + salary;
    }

    public void printShortInfo() {
        System.out.println("Имя - " + firstName + ", зарплата - " + salary);
    }
}
