package src.Day_19_Polymorphism.MethodOverloading.DynamicPolymorphism;

public class LibraryMember {
    String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    public void borrowBook(){
        System.out.println(name + " can borrow book");
    }
}
