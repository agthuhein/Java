package src.Day_19_Polymorphism.MethodOverloading.DynamicPolymorphism;

public class MainApplication {
    public static void main(String[] args) {
        LibraryMember[] members = new LibraryMember[3];

        members[0] = new LibraryMember("Alex");
        members[1] = new StudentMember("Bob");
        members[2] = new ProfessorMember("Dr. Jane");

        for (LibraryMember member : members) {
            member.borrowBook();
        }

        StudentMember frank = new StudentMember("Frank");
        frank.borrowBook();
    }
}
