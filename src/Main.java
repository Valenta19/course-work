import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] workers = new Employee[10];
        workers[0] = new Employee("  Аксенова Екатерина Максимовна", 2, 45000);
        workers[1] = new Employee("Александров Иван Даниилович", 1, 30000);
        workers[2] = new Employee("Анисимов Павел Владимирович", 3, 30000);
        workers[3] = new Employee("Антонова Вероника Данииловна", 4, 32000);
        workers[4] = new Employee("Белова Дарья Степановна", 3, 34000);
        workers[5] = new Employee("Березина Екатерина Александровна", 2, 29000);
        workers[6] = new Employee("Богданова София Матвеевна", 2, 41000);
        workers[7] = new Employee("Богомолов Фёдор Александрович,", 5, 50000);
        workers[8] = new Employee("Борисов Александр Михайлович", 5, 50000);
        workers[9] = new Employee("Борисова Полина  Егоровна", 4, 35000);
        System.out.println(Arrays.toString(workers));
        System.out.println("Сумма затрат на зарплаты в месяц = " + Employee.salarySum(workers));
        System.out.println("минимальная заплата = " + Employee.minSalary(workers));
        System.out.println("Максимальная зарплата = " + Employee.maxSalary(workers));
        System.out.println(" ФИО всех сотрудников = " + Employee.fullNameWorkers(workers));
        System.out.println("среднее значение затрат на месяц = " + Employee.averageSalary(workers));

    }
}