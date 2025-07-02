package multiThreading;

import java.sql.SQLOutput;

public class MyThread extends Thread{

//    public MyThread(String name){
//        super(name);
//    }

    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {

        for(int i = 0; i < 1000; i++){
            counter.increment();
        }

//        for (int i =0; i<=5; i++){
//            String a = "";
//            for(int j = 0; j < 10000; j++){
//                a+="a";
//            }
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + "-count: " + i);
//            try{
//                Thread.sleep(100);
//            }catch(Exception e){
//
//            }
//        }

//        System.out.println("Thread is Running");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        System.out.println("Running");
//        try {
//            Thread.sleep(2000);
//            System.out.println("Thread is running");
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted" + e);
//        }

//        for (int i = 0; i < 5; i++){
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
//        }

//        while(true){
//            System.out.println("Hello World!");
//        }

    }

//    public static void main(String[] args) throws InterruptedException {
//
//        MyThread myThread = new MyThread();
//        myThread.setDaemon(true);
//        myThread.start();
//        System.out.println("Main done ");
//
////        MyThread t1 = new MyThread();
////        MyThread t2 = new MyThread();
////        t1.start();
////        t2.start();
////        t1.interrupt();
//
////        MyThread l = new MyThread("Low "); //NEW
////        MyThread m = new MyThread("Mid"); //NEW
////        MyThread h = new MyThread("High"); //NEW
////
////        l.setPriority(Thread.MIN_PRIORITY);
////        l.start();
////
////        h.setPriority(Thread.MAX_PRIORITY);
////        h.start();
////
////        m.setPriority(Thread.NORM_PRIORITY);
////        m.start();
////        t1.join();
////        System.out.println("Hello");
//        //        System.out.println(t1.getState());//Runnable
////        t1.start();
////        Thread.sleep(100);
////        System.out.println(t1.getState());//Timed_Waiting
////        t1.join();
////        System.out.println(t1.getState());//Terminated
//    }
}
