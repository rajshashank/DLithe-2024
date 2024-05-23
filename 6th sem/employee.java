// write a program to store and display employee data use  id ,name ,dept, salary with only display method use objects




import java.util.*;


public class employee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    }
}

class emp {
    int id,salary;
    String name, dept;
    
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Salary: " + salary);
    }
}
