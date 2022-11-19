package org.example;

import java.util.concurrent.Executors;

/**
 * ${END}
 * @since ${DATE}
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Executors.newSingleThreadExecutor().submit(() -> System.out.println("task"));
    }
}