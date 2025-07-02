package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        FairLockExample example = new FairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run(){
            example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread1");
        Thread thread2 = new Thread(task, "Thread2");
        Thread thread3 = new Thread(task, "Thread3");

        thread1.start();
        Thread.sleep(30);
        thread2.start();
        Thread.sleep(30);
        thread3.start();
    }
}
