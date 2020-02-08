import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        char option = ' ';

        do {
            System.out.println("Welcome to Employee Record Console Application");
            System.out.println("[a] - Add Employee Record.");
            System.out.println("[b] - Show Employees Record.");
            System.out.println("[c] - Exit Program");
            System.out.print("Option: ");
            option = scan.nextLine().charAt(0);

            switch(option) {
                case 'a': case 'A': 
                        employees.add(createEmployee());
                    break;

                case 'b': case 'B': 
                        showEmployees(employees);
                    break;

                case 'c': case 'C': flag = false; break;
            }
        } while(flag);
        scan.close();
    }

    private static Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add Employee Record");

        System.out.print("Enter First Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lname = sc.nextLine();
        System.out.println("Enter address");
        String add = sc.nextLine();
        System.out.println("Enter Email");
        String mail = sc.nextLine();
        System.out.println("Enter Job Position");
        String job = sc.nextLine();
        System.out.println("Enter Contact");
        int con = sc.nextInt();
        System.out.println("Enter Rate");
        double rating = sc.nextDouble();
        
        


        
        return new Employee(fname, lname, add,mail, job, con, rating);
        
    }

    private static void showEmployees(ArrayList<Employee> employees) {
        if(employees.isEmpty()) {
            System.out.println("No Available Record.");
        } else {
            System.out.println("List of Employees");
            for(Employee employee : employees) {
                System.out.println(
                    "Employee No. " + employees.indexOf(employee) + 
                    ", Employee Name: " + employee.getFullName() +
                    "\nEmployee address: " + employee.getAddress() +
                    "\nEmployee Email: " + employee.getEmail() +
                    "\nEmployee Job Position: " + employee.getJobPosition() +
                    "\nEmployee Contact: " + employee.getContact() +
                    "\nEmployee Rate: " + employee.getRate()
                );
            }
        }
    }
}