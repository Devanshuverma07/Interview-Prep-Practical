package multiThreading;
class Pen {
    public synchronized void write(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " acquired Pen lock, attempting to acquire Paper lock...");
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        paper.use();
    }

    public synchronized void use() {
        System.out.println(Thread.currentThread().getName() + " is using the Pen.");
    }
}

// Paper.java
class Paper {
    public synchronized void write(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " acquired Paper lock, attempting to acquire Pen lock...");
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pen.use();
    }

    public synchronized void use() {
        System.out.println(Thread.currentThread().getName() + " is using the Paper.");
    }
}

// Task1.java
class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.write(paper);
    }
}

// Task2.java
class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.write(pen);
    }
}



public class DeadLockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread t2 = new Thread(new Task2(pen, paper), "Thread-2");

        t1.start();
        t2.start();
    }
}
