package ua.goit;

import java.util.Date;

/*Завдання 1
Напишіть програму, яка кожну секунду відображає на екрані дані про час, що минув від моменту запуску програми.

Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.

Завдання 2
Напишіть програму, що виводить в консоль рядок, що складається з чисел від 1 до n, але з заміною деяких значень:

якщо число ділиться на 3 - вивести fizz
якщо число ділиться на 5 - вивести buzz
якщо число ділиться на 3 і на 5 одночасно - вивести fizzbuzz
Наприклад, для n = 15, очікується такий результат: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz.

Програма повинна бути багатопотоковою, і працювати з 4 потоками:

Потік A викликає fizz(), щоб перевірити, чи ділиться число на 3, і якщо так - додати в чергу на виведення для потоку D рядок fizz.
Потік B викликає buzz(), щоб перевірити, чи ділиться число на 5, і якщо так - додати в чергу на виведення для потоку D рядок buzz.
Потік C викликає fizzbuzz(), щоб перевірити, чи ділиться число на 3 та 5 одночасно, і якщо так - додати в чергу на виведення для потоку D рядок fizzbuzz.
Потік D викликає метод number(), щоб вивести наступне число з черги, якщо є таке число для виведення.*/

public class Main {

    public static void main(String[] args) throws InterruptedException {
/*
        Date runDate = new Date();
        Thread timePassed = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    try {
                        System.out.println("From program start " +
                                ((new Date()).getTime() - runDate.getTime()) / 1000 + " seconds passed");
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
       };
        Thread passed5Seconds = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    try {
                        Thread.sleep(5000);
                        System.out.println("5 seconds passed");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        timePassed.start();
        passed5Seconds.start();

        Thread.sleep(20000);

        timePassed.stop();
        passed5Seconds.stop();
*/

//      Task 2
        int number = 15;
        ThreadTask threadTask = new ThreadTask(15);
        threadTask.run();
















    }

}

