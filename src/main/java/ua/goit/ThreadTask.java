package ua.goit;

public class ThreadTask {
    int counter = 1;
    int value;

    public ThreadTask(int value) {
        this.value = value;
    }


    public void run() {
        Thread fizz = new Thread(() -> {
            try {
                fizz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread buzz = new Thread(() -> {
            try {
                buzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread fizzBuzz = new Thread(() -> {
            try {
                fizzBuzz();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        fizz.start();
        buzz.start();
        fizzBuzz.start();

    }

    public synchronized void fizz() throws InterruptedException {
        while (counter <= value) {
            if (counter % 3 == 0) {
                System.out.print("fizz");
                counter++;
                notifyAll();
            } else {
                wait();
            }
        }

    }

    public synchronized void buzz() throws InterruptedException {
        while (counter <= value) {
            if (counter % 5 == 0) {
                System.out.print("buzz");
                counter++;
                notifyAll();
            } else {
                wait();
            }
        }

    }

    public synchronized void fizzBuzz() throws InterruptedException {
        while (counter <= value) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.print("fizzBuzz");
                counter++;
                notifyAll();
            } else {
                wait();
            }
        }

    }

}
