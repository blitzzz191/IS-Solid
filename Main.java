public class Main {
    public static void main (String[] args) {
    Employee1 employee1 = new Cook();
    employee1.eat();
    employee1.work();
    }
}
interface Employee {
    void work();
}
interface Eater {
    void eat();
}
interface Employee1 extends Employee, Eater {

}
class Cook implements Employee1 {

    @Override
    public void work() {
        System.out.println("cooking");
    }
    @Override
    public void eat() {
        System.out.println("eating");
    }
}
 class Janitor implements Employee {
    @Override
    public void work() {
        System.out.println("cleaning up");
    }
}

