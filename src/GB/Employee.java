package GB;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String tel;
    private double salary;
    private int age;



    public Employee (String name, String position, String email, String tel, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    String getInfo (){
        return "Имя: " + this.name +
               ". Должность: " + this.position +
               ". Почта: " + this.email +
               ". Телефон: " + this.tel +
               ". ЗП: " +  this.salary +
               ". Возраст: " + this.age;
    }

    public int getAge(){
        return this.age;
    }
    
    
}

