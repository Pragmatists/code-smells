package codeSmells.refactoring.extractDelegate;

public class ExtractDelegate {

    class Foo {
        private String b;
        public String getInfo() {
            return ("(" + b + ")");
        }
    }

    class Bar {
        Foo foo;
        String t2 = foo.getInfo();
    }
}
