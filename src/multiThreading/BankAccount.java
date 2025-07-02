package multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;
    private final Lock lock = new ReentrantLock();



    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw " + amount);

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + "proceeding with withdrawals");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "completed withdrawals. Remaining balance: " + balance);
                    }catch(Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + "insufficient amount");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + "Could not acquire the lock, will try again later!");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }



//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + "proceeding with withdrawals");
//            try{
//                Thread.sleep(3000);
//            }catch(InterruptedException e){
//
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + "completed withdrawals. Remaining balance: " + balance);
//        }else{
//            System.out.println(Thread.currentThread().getName() + "insufficient amount");
//        }
    }
}
