package GB;

public class Main {

    public static void main(String[] args) {
       Employee [] empArray = {
               new Employee("Pavel", "manager", "pavel@ya.ru", "89991234567", 39000.4, 43),
               new Employee("Petr", "ceo", "petr@ya.ru", "89991234547", 80000, 45),
               new Employee("Dan", "seller", "petr@ya.ru", "89461234547", 20000, 28),
               new Employee("Leo", "programmer", "petr@ya.ru", "89452345647", 800000.6, 20),
               new Employee("Max", "designer", "petr@ya.ru", "89541235647", 100000, 23)};

        for (Employee employee : empArray) {
            if (employee.getAge() >= 40) System.out.println(employee.getInfo());
        }
    }
    
    
    
}
