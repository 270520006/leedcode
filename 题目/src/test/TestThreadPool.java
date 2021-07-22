package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3, 6, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(8));
        for (int i = 0; i <15 ; i++) {
            Thread.sleep(100);
            threadPoolExecutor.execute(()->{
                System.out.println("线程编号是："+Thread.currentThread().getName()+"进入了睡眠");
                System.out.println("阻塞队列是否为空？"+threadPoolExecutor.getQueue().peek());
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
