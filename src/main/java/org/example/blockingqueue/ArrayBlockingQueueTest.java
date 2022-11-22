package org.example.blockingqueue;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @since 2022/11/22
 * @author dingrui
 */
public class ArrayBlockingQueueTest {

    @Test
    public void test00() throws InterruptedException {
        BlockingQueue<Long> q = new ArrayBlockingQueue<>(1);
        q.put(1L);
        q.put(2L);
        Long ans = q.take();
    }
}
