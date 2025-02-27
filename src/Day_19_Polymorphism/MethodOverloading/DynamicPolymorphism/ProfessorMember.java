package src.Day_19_Polymorphism.MethodOverloading.DynamicPolymorphism;

public class ProfessorMember extends LibraryMember{

    public ProfessorMember(String name){
        super(name);
    }

    @Override
    public void borrowBook(){
        System.out.println(name + " can borrow up to 10 books.");
    }
}
