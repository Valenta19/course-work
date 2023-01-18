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

    public String setFullName(String fullName) {
        return this.fullName;
    }

    public int setDepartment(int department) {
        return this.department;
    }

    public int setSalary(int salary) {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public int setID() {
        return this.id;
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
        String name = null;
        for (int i = 0; i < workers.length; i++) {
            name += ", ";
            name += workers[i].getFullName();
        }
        System.out.println(" ФИО всех сотрудников =" + name);
        return name;
    }

    public static int minSalary(Employee[] workers) {

        int min = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
                min = workers[i].getSalary();

            }
        }
        System.out.println("минимальная заплата = " +  min);
        return min;
    }

    public static int maxSalary(Employee[] workers) {
        int max = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (max < workers[i].getSalary()) {
                max = workers[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата = " + max);
        return max;
    }
    public static int salarySum(Employee[] workers) {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }

}

