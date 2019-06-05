package codeSmells.refactoring.extractConstant;

import java.util.ArrayList;

public class Class {
    public void method() {
        ArrayList list = new ArrayList();
        list.add("string");
        anotherMethod("string");
    }
    private void anotherMethod(String string) {
    }
}
