package ru.innopolis.tests;

import java.io.IOException;

public class SomeClass {
    public Integer getSumm(int a, int b) {
        return a + b;
    }

    public void doSome(int a) throws IOException {
        if (a == 5) {
            throw new IOException("Some exception");
        }
    }


}
