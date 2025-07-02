package multiThreading;

class SharedResources{

    private int data;

    private boolean hasData;

    public synchronized void produce(int value) throws InterruptedException {
        while(hasData){
            wait();
        }

        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData){
            wait();
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable{
    private SharedResources resource;

    public Producer(SharedResources resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i =0 ; i < 10; i++){
            try {
                resource.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    private SharedResources resource;

    public Consumer(SharedResources resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i =0 ; i < 10; i++){
            try {
                int value = resource.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResources resources = new SharedResources();
        Thread producerThread = new Thread(new Producer(resources));
        Thread consumerThread = new Thread(new Consumer(resources));

        producerThread.start();
        consumerThread.start();
    }
}
