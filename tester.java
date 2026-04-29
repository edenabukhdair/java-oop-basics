public class tester {
    public  static void main(String[] args) {
        laptop lap1=new laptop();
        lap1.setPrice(3000);
    System.out.println(lap1);
    /// ///////
    BANKACCOUNT bank=new BANKACCOUNT();
    bank.setOwner("mdalalelbiet");
    bank.setBalance(100);
     bank.setDeposit(200);
     bank.setWithdraw(50);
     System.out.println(bank);
/// ////////
        book book1 = new book();
        book1.setPages(432);
        book1.setTitle("yummy");
        System.out.println(book1);
        /// ///////////
        dog dog1 = new dog();
        dog1.setName("Buddy");
        dog1.setAge(3);
        System.out.println(dog1);
        /// ////////////
        light onoff = new light();
        onoff.setTurnon();
        System.out.println(onoff);
        onoff.setTurnoff();
        System.out.println(onoff);
        /// ///////////////
        circle area= new circle();
        area.setCircle(100);
        System.out.println(area);
        /// ////////////////
        classroom student = new classroom();
        student.setStudents(new String[3]);
        System.out.println(student);
        /// ////////////////
        counter counter = new counter();
        counter.setCount(7);
        counter.getIncrease();
        counter.getDecrease() ;
        System.out.println(counter);











}}

