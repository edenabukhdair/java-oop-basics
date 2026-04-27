import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.age = 3;
        dog1.printDetails();
        System.out.println("===============================");

        Book book1 = new Book();
        book1.pages=432;
        book1.title="yummy";
        System.out.println(book1);
        System.out.println("===============================");

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner="mdalalelbiet";
        bankAccount1.balance=100;
        System.out.println(bankAccount1);
         bankAccount1.deposit(200);
         System.out.println(bankAccount1);
        bankAccount1.withdraw(50);
        System.out.println(bankAccount1);
        System.out.println("===============================");

        Light onoff = new Light();
        onoff.ison=true;
        onoff.printDetails();
        System.out.println("===============================");


        Circle area= new Circle();
        area.radius=100;
        System.out.println(area);
        System.out.println("==============================");

        Classroom student = new Classroom();
        student.students = new String[3];
        student.students[0]="kk";
        System.out.println(student);
        System.out.println("===============================");

        Counter counter = new Counter();
        counter.count = 7;
        counter.increase();
        counter.decrease();
        System.out.println(counter);
        System.out.println("===============================");








    }}


