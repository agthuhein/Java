package src.Day_18_Inheritance.Protected.package_2;

import src.Day_18_Inheritance.Protected.package_1.Parent;

public class DifferentPackageChild extends Parent {
    public void accessProtectedMethod() {
        protectedMethod();
    }
    public static void main(String[] args) {
        DifferentPackageChild dp = new DifferentPackageChild();
        dp.accessProtectedMethod();
    }
}
