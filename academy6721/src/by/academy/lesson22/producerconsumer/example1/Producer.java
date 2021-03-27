package by.academy.lesson22.producerconsumer.example1;
public class Producer implements Runnable {
    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
				myQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
