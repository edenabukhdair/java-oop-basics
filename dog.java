public class dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;}
    public String getName() {
        return this.name;}

    public void setAge(int age) {
        this.age = age;}
    public int getAge() {
        return this.age;}


    public String toString() {
        return "DOG{NAME = " + getName() + ", AGE = " + getAge() + "}";
    }
}
