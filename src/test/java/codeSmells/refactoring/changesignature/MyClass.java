package codeSmells.refactoring.changesignature;

public class MyClass {

    public void myMethod(int value) {

    }

    public class MyOtherClass {
        public void myMethodCall(MyClass myClass) {
            double d=0.5;

            myClass.myMethod(1);
        }
    }
}
