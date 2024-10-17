//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread trampa1 = new Trampitas("A");
        Thread trampa2 = new Trampitas("B");
        Thread trampa3 = new Trampitas("C");


        try {
            trampa1.join();
            trampa2.join();
            trampa3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}