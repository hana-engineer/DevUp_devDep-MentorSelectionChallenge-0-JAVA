

import java.util.ArrayList;
import java.util.List;

public class ClubManager {
	
	    private List<ClubMember> members = new ArrayList<>();
	    private List<ClubDepartment> departments = new ArrayList<>();
	    
	    public void setDepartments(List<ClubDepartment> departments) {
			this.departments = departments;
		}

	    // Create member
	    public void addMember(ClubMember member) {
	        members.add(member);
	        System.out.println("Member added: " + member);
	    }

	    // Read members
	    public void viewMembers() {
	        if (members.isEmpty()) {
	            System.out.println("No members in the club.");
	        } else {
	            members.forEach(System.out::println);
	        }
	    }

	    // Update member
	    public void updateMember(int id, String newFirstName, String newLastName) {
	        for (ClubMember member : members) {
	            if (member.idPerson == id) {
	                member.firstName = newFirstName;
	                member.midIName = newLastName;
	                System.out.println("Updated Member: " + member);
	                return;
	            }
	        }
	        System.out.println("Member not found!");
	    }

	    // Delete member
	    public void deleteMember(int id) {
	        members.removeIf(member -> member.idPerson == id);
	        System.out.println("Member with ID " + id + " deleted.");
	    }

		public List<ClubDepartment> getDepartments() {
			return departments;
		}


	}