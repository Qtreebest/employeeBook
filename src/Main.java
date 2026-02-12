public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        System.out.println("Task1");
        System.out.println(book.addEmployee(new Employee("Иван", "Иванов", "Иванович", 5, 100)));
        System.out.println(book.addEmployee(new Employee("Петр", "Петров", "Петрович", 1, 200)));
        System.out.println(book.addEmployee(new Employee("Александр", "Александров", "Александрович", 3, 400)));
        System.out.println(book.addEmployee(new Employee("Иван", "Дмитриев", "Дмитриевич", 2, 135)));
        System.out.println(book.addEmployee(new Employee("Петр", "Дмитриев", "Дмитриевич", 3, 137)));
        System.out.println(book.addEmployee(new Employee("Дмитрий", "Петров", "Александрович", 4, 187)));
        System.out.println(book.addEmployee(new Employee("Иван", "Дмитриев", "Дмитриевич", 5, 137)));
        System.out.println(book.addEmployee(new Employee("Петр", "Дмитриев", "Александрович", 1, 176)));
        System.out.println(book.addEmployee(new Employee("Дмитрий", "Дмитриев", "Дмитриевич", 2, 109)));
        System.out.println(book.addEmployee(new Employee("Иван", "Петров", "Александрович", 3, 147)));
        System.out.println(book.addEmployee(new Employee("Александр", "Дмитриев", "Дмитриевич", 4, 143)));
        book.printAllEmployees();
        System.out.println("Средняя: " + book.averageSalary());
        book.printTaxes(EmployeeBook.TAX_PROGRESSIVE);
        book.indexDeportament(1, 25);
        book.findFirstByDepartamentAndSalary(1, 110);
        book.printLowerSalary(250, 1);
        System.out.println(book.findById(4));
    }
}