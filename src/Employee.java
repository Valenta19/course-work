public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int grow;
    private int id;


    public Employee(String fullName, int department, int salary) {
        grow++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = grow;

    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setFullName(String fullName) {
         this.fullName = fullName;
    }

    public void setDepartment(int department) {
         this.department = department;
    }

    public void setSalary(int salary) {
         this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setID() {
         this.id = id;
    }

    public String toString() {
        return "workers{" +
                "имя сотрудника ='" + fullName + '\'' +
                ", отдел=" + department + '\'' +
                ", зарплата =" + salary + '\'' +
                ", id =" + id +
                '}';
    }


    public static String fullNameWorkers(Employee[] workers) {
        System.out.print(" ФИО всех сотрудников = ");
        String name = workers[0].getFullName();
        for (int i = 0; i < workers.length; i++) {
            name += ", ";
            name += workers[i].getFullName();
        }
        return name;
    }

    public static int minSalary(Employee[] workers) {

        int min = workers[0].getSalary();
        System.out.print("минимальная заплата = ");
        for (int i = 0; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
                min = workers[i].getSalary();

            }
        }
        return min;
    }

    public static int maxSalary(Employee[] workers) {
        System.out.print("Максимальная зарплата = ");
        int max = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (max < workers[i].getSalary()) {
                max = workers[i].getSalary();
            }
        }
        return max;
    }
    public static int salarySum(Employee[] workers) {
        System.out.print("Сумма затрат на зарплаты в месяц = ");
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }
    public static int averageSalary(Employee[] workers) {
        System.out.print("среднее значение затрат на месяц = ");
        int sum1 = Employee.salarySum(workers);
        System.out.println(sum1 / workers.length);
        return sum1;
    }

}

