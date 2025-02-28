package src.Day_19_Polymorphism.Interface;

public interface IName {
    //Constant
    int CONSTANT = 100;

    //Abstract methods
    void methodName();

    //default methods
    default void defaultMethod() {
        System.out.println("Default method");
    }

    //static method
    static void staticMethod() {
        System.out.println("Static method");
    }
}
