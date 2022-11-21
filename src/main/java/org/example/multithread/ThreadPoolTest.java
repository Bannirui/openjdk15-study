package org.example.multithread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @since 2022/11/20
 * @author dingrui
 */
public class ThreadPoolTest {

    @Test
    public void test00() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println("task"));
    }
}
