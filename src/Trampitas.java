import java.util.concurrent.Semaphore;

public class Trampitas extends Thread{
    public Trampitas(String name) {
        super(name);

        start();
    }

    @Override
    public void run() {
        Semaphore sem = new Semaphore(1);

        if (getName().equals("A")){
            sem.release();
            System.out.println("Soy el hilo "+ getName());

        }
        if (getName().equals("B") || getName().equals("C")){
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
