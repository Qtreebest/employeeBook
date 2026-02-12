public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public static final String TAX_PROPORTIONAL = "PROPORTIONAL";
    public static final String TAX_PROGRESSIVE = "PROGRESSIVE";

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public double averageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e == null) {
                break;
            }
            sum += e.getSalary();
            count++;
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public void printTaxes(String type) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }

            double tax = 0;

            switch (type) {
                case TAX_PROPORTIONAL:
                    tax = e.getSalary() * 0.13;
                    break;

                case TAX_PROGRESSIVE:
                    if (e.getSalary() <= 150) {
                        tax = e.getSalary() * 0.13;
                    } else if (e.getSalary() <= 350) {
                        tax = e.getSalary() * 0.17;
                    } else {
                        tax = e.getSalary() * 0.21;
                    }
                    break;
                default:
                    System.out.println("Неизвестный тип");
                    continue;
            }
            System.out.println(e.getFirstName() + " налог: " + tax);
        }
    }

    public void indexDeportament(int departament, int percent) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() != departament) {
                continue;
            }

            int newSalary = e.getSalary() + (e.getSalary() * (percent / 100));
            e.setSalary(newSalary);
        }
    }

    public void findFirstByDepartamentAndSalary(int departament, int salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];

            if (e == null) {
                continue;
            }
            if (e.getDepartment() == departament && e.getSalary() > salary) {
                System.out.print("найден №" + i + ": ");
                e.printShortInfo();
                break;
            }
        }
    }

    public void printLowerSalary(int wage, int employeeNumber) {
        int i = 0;
        int found = 0;

        while (i < employees.length) {
            if (employees[i] == null) {
                break;
            }

            if (employees[i].getSalary() < wage) {
                employees[i].printShortInfo();
                found++;
            }
            if (found == employeeNumber) {
                break;
            }

            i++;
        }
    }

    public boolean contains(Employee employee) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public Employee findById(int id) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
