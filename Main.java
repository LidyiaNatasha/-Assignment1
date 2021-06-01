
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int respond, add;

    public static void main(String[] args) {
        do {
            mainMenu();
            respond = scan.nextInt();
            System.out.println("----------------------------------------------------------");
            switch (respond) {
                case 1:
                    admin();
                    break;
                case 2:
                    participant();
                    break;
                case 3:
                    System.out.println("Thank you. Please come again.");
                    break;
                default:
                    System.out.println("Please enter 1-3 only!");
                    break;
            }

        } while (respond != 3);
    }

    public static void mainMenu() { //method for main menu
        System.out.println("---------------------------------------------------------------");
        System.out.println("   WELCOME TO 7DS CODING CLASS PROGRAM   ");
        System.out.println("---------------------------- MENU -----------------------------");
        System.out.println("What are your role?\n");
        System.out.println("1. An Admin");
        System.out.println("2. A Participant/Student");
        System.out.println("3. Exit");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Enter your option: ");
    }

    public static void admin() {
        String name, address, subject, gender;
        String email, location;
        int contactNo;
        int age, salary, id;
        double costSalaryEmployee, costAdvertisment;
        double sumSalary = 0.0;
        double sumCostAdvertisement = 0.0;
        double Sales, Sum;

        double earlybirdDiscount, firstTimeDiscount;
        String briefExplaination, month;

        EducationDayCampsCompany company = new EducationDayCampsCompany("7DS COMPANY", "7DS1234@gmail.com", "No. 34 Bangunan Wangsa, Johor", 01674417);

        System.out.println();
        System.out.println("********** INFORMATION OF EDUCATION DAY CAMPS COMPANY **********");
        System.out.println("Name " + company.getName());
        System.out.println("Email " + company.getEmail());
        System.out.println("Location " + company.getLocation());
        System.out.println("Contact Number " + company.getContactNo());

        System.out.println("****************************************************************");
        System.out.print("How many employees you want to enter its information? ");
        int em = scan.nextInt();
        Employee[] emList = new Employee[em];
        for (int i = 0; i < emList.length; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            System.out.print("Enter ID: ");
            id = scan.nextInt();
            System.out.print("Enter name: ");
            name = scan.next() + scan.nextLine();
            System.out.print("Enter gender (Female/Male): ");
            gender = scan.next();
            System.out.print("Enter address: ");
            address = scan.next() + scan.nextLine();
            System.out.print("Enter his/her department: ");
            subject = scan.next();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            System.out.print("Enter his/her salary: ");
            salary = scan.nextInt();
            sumSalary = salary + sumSalary;

            emList[i] = new Employee(id, name, gender, address, subject, age, salary);
        }

        System.out.println("***************** INFORMATION OF EMPLOYEES **********************");
        for (int i = 0; i < emList.length; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            System.out.println("ID: " + emList[i].getId());
            System.out.println("Name: " + emList[i].getName());
            System.out.println("Gender: " + emList[i].getGender());
            System.out.println("Address: " + emList[i].getAddress());
            System.out.println("Teaching Subject: " + emList[i].getSubject());
            System.out.println("Age: " + emList[i].getAge());
            System.out.println("Salary: " + emList[i].getSalary());
        }
        System.out.println("*****************************************************************");

        System.out.println("Enter the brief expalination : ");
        briefExplaination = scan.next() + scan.nextLine();
        System.out.println("Enter the month : ");
        month = scan.next();

        ClassDesription cd = new ClassDesription(briefExplaination, month);

        System.out.println();
        System.out.println("************** INFORMATION OF CLASS DESCRIPTION *****************");
        System.out.println("Enter brief explaination " + cd.getBriefExplaination());
        System.out.println("Start month " + cd.getMonth());

        System.out.println("*****************************************************************");

        System.out.print("Enter early bird Discount: ");
        earlybirdDiscount = scan.nextInt();
        System.out.print("Enter firstTimeDiscount: ");
        firstTimeDiscount = scan.nextInt();

        Advertisement ad = new Advertisement(earlybirdDiscount, firstTimeDiscount);

        System.out.println();
        System.out.println("********************* INFORMATION OF ADVERTISEMENT ****************");
        System.out.println(" Earlybird Discount " + ad.getEarlybirdDiscount());
        System.out.println(" First time Discount " + ad.getFirstTimeDiscount());
        System.out.println("********************************************************************");

        String[] s = {"Introduction To Programming", "Object Oriented Programming", "Graphic Users Interface"};
        double[] price = {50.00, 60.00, 100.00};
        int num;
        double sumSales = 0.0;

        for (int i = 0; i < s.length; i++) {

            System.out.println("How many Student enroll " + s[i]);
            num = scan.nextInt();
            sumSales = (price[i] * num) + sumSales;

        }

        costSalaryEmployee = sumSalary;
        costAdvertisment = ad.getEarlybirdDiscount() + ad.getFirstTimeDiscount();

        Finance f = new Finance(costSalaryEmployee, costAdvertisment, sumSales);
        System.out.println("****************REPORT FOR THIS MONTH********************************");
        System.out.println("The Total employee's salary : " + f.getCostSalaryEmployee());
        System.out.println("The total cost advertisement :  " + f.getCostAdvertisment());
        System.out.println("Total Cost : " + f.totalCost(costSalaryEmployee, costAdvertisment));
        System.out.println("Total Sales : " + f.getSales());
        System.out.println("*********************************************************************");

    }

    public static void participant() {

        String name, gender, address, email;
        int age, contactNo;

        System.out.print("Enter your name: ");
        name = scan.next() + scan.nextLine();
        System.out.print("Enter your gender (Female/Male): ");
        gender = scan.next();
        System.out.print("Enter your email address: ");
        email = scan.next();
        System.out.print("Enter your address: ");
        address = scan.next() + scan.nextLine();
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        System.out.print("Enter your phone number: ");
        contactNo = scan.nextInt();

        Registration participantList = new Registration(name, gender, email, address, age, contactNo);

        System.out.println("What do you want to learn from our program?");
        System.out.println("1. Introduction To Programming \n2. Object Oriented Programming \n3. Graphic Users Interface");
        int choose = scan.nextInt();

        String[] subject = {"Introduction To Programming", "Object Oriented Programming", "Graphic Users Interface"};
        double[] price = {50.00, 60.00, 100.00};

        System.out.println();
        System.out.println("--------------------THIS IS YOUR REGISTRATION SLIP-------------------");
        System.out.println("Name: " + participantList.getName());
        System.out.println("Gender: " + participantList.getName());
        System.out.println("Email: " + participantList.getName());
        System.out.println("Age: " + participantList.getName());
        System.out.println("Contact No: " + participantList.getName());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("You have enrolled to " + subject[choose - 1] + " class");
        System.out.println("You have to pay " + price[choose - 1]);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

}
