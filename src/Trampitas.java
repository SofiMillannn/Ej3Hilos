import java.util.concurrent.Semaphore;

public class Trampitas extends Thread{
    static Semaphore sem = new Semaphore(0);

    public Trampitas(String name) {
        super(name);

        start();
    }

    @Override
    public void run() {


        if (!getName().equalsIgnoreCase("B")){
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
            if (getName().equalsIgnoreCase("A"))
            try {
                sem.acquire(2);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }

        }
        System.out.println("Soy el hilo "+ getName());
        sem.release(2);

    }
}
