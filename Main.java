

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ClubManager clubManager = new ClubManager();

        // Sample data for demonstration
        ClubMember manager = new ClubMember(1, "HANA", "AZZI", "DZ", LocalDate.of(2005, 2, 01), "Algeria",
                LocalDateTime.now(), LocalDateTime.now(), null, "UMBB", "ILTI", "Master", "Bio here", "profile1.bmp");

        List<ClubMember> coManagers = new ArrayList<>();
        coManagers.add(manager);

        ClubDepartment designDept = new ClubDepartment(1, manager, coManagers, "Design", "Designs the club's digital content");

        // Assign department to the member
        manager.clubDepartment = designDept;

        // Operations loop
        while (true) {
        	System.out.println("\n*** Club Member Management ***");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Update Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Exit");

            System.out.print("Please enter your choice (1-5): ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
            case 1:
                // For simplicity
                ClubMember newMember = new ClubMember(2, "SARA", "SR", "SARAA", LocalDate.of(1997, 7, 15),
                        "USA", LocalDateTime.now(), LocalDateTime.now(), designDept, "UMBB", "TI", "Licence", "Bio of Alice", "profile2.bmp");
                clubManager.addMember(newMember);
                break;
            case 2:
                clubManager.viewMembers();
                break;
            case 3:
                System.out.print("Enter member ID to update: ");
                int updateId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter new last name: ");
                String lastName = scanner.nextLine();
                clubManager.updateMember(updateId, firstName, lastName);
                break;
            case 4:
                System.out.print("Enter member ID to delete: ");
                int deleteId = Integer.parseInt(scanner.nextLine());
                clubManager.deleteMember(deleteId);
                break;
            case 5:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
   }
	}
}
            

            

