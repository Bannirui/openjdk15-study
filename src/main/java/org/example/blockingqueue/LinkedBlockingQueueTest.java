package org.example.blockingqueue;

import org.junit.jupiter.api.Test;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @since 2022/11/22
 * @author dingrui
 */
public class LinkedBlockingQueueTest {

    @Test
    public void test00() throws InterruptedException {
        LinkedBlockingQueue<Long> q = new LinkedBlockingQueue<>();
        q.put(1L);
        Long ans = q.take();
        System.out.println();
    }
}
