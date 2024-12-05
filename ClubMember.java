
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClubMember {
	
	    int idPerson;
	    String name;
	    String midIName;
	    String firstName;
	    LocalDate birthDate;
	    String birthLocation;
	    LocalDateTime firstJoinDate;
	    LocalDateTime lastRejoinDate;
	    ClubDepartment clubDepartment;
	    String university;
	    String speciality;
	    String studyLevel;
	    String bio;
	    String profileImage;

	    public ClubMember(int idPerson, String name, String midIName, String firstName, LocalDate birthDate, String birthLocation,
	                      LocalDateTime firstJoinDate, LocalDateTime lastRejoinDate, ClubDepartment clubDepartment,
	                      String university, String speciality, String studyLevel, String bio, String profileImage) {
	        this.idPerson = idPerson;
	        this.name = name;
	        this.midIName = midIName;
	        this.firstName = firstName;
	        this.birthDate = birthDate;
	        this.birthLocation = birthLocation;
	        this.firstJoinDate = firstJoinDate;
	        this.lastRejoinDate = lastRejoinDate;
	        this.clubDepartment = clubDepartment;
	        this.university = university;
	        this.speciality = speciality;
	        this.studyLevel = studyLevel;
	        this.bio = bio;
	        this.profileImage = profileImage;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + idPerson + ", Name: " + firstName + " " + midIName + ", Department: " + clubDepartment.departmentName;
	    }
	

}
