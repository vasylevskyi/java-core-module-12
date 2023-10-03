package ua.goit;

public class ThreadTask {
    int counter = 1;
    int value;

    public ThreadTask(int value) {
        this.value = value;
    }


    public synchronized void fizz() throws InterruptedException {
        while (counter <= value) {
            if (counter % 3 == 0 && counter % 5 != 0) {
                System.out.print("fizz, ");
                counter++;
                notifyAll();
            } else if (counter == value ) {
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
            if (counter % 5 == 0 && counter % 3 != 0) {
                System.out.print("buzz, ");
                counter++;
                notifyAll();
            } else if (counter == value ) {
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
                System.out.print("fizzBuzz, ");
                counter++;
                notifyAll();
            } else if (counter == value ) {
                    System.out.print("fizzBuzz");
                    counter++;
                    notifyAll();
            } else {
                wait();
            }
        }

    }

    public synchronized void number() throws InterruptedException {
        while (counter <= value) {
            if (counter % 3 != 0 && counter % 5 != 0) {
                System.out.print(counter + ", ");
                counter++;
                notifyAll();
            } else if (counter == value ) {
                System.out.print(counter);
                counter++;
                notifyAll();
            } else {
                wait();
            }
        }

    }

}
