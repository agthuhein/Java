package src.Day_18_Inheritance.Protected.package_2;

import src.Day_18_Inheritance.Protected.package_1.Parent;

public class TestProtected {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //parent.protectedMethod(); //this is not working
        System.out.print("Cannot access protected method directly.");
    }
}
