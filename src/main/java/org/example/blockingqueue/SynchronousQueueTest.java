package org.example.blockingqueue;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.*;

/**
 *
 * @since 2022/11/22
 * @author dingrui
 */
public class SynchronousQueueTest {

    @Test
    public void tet00() throws InterruptedException, IOException {

        BlockingQueue<String> q = new SynchronousQueue<>();

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        pool.schedule(() -> {
            try {
                q.put("1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 1_000, TimeUnit.MILLISECONDS);

        pool.schedule(() -> {
            try {
                q.put("2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 10_000, TimeUnit.MILLISECONDS);

        System.in.read();
    }

    @Test
    public void test01() throws InterruptedException {
        SynchronousQueue<String> q = new SynchronousQueue<>();
        q.take();
    }
}
