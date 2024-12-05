
import java.util.List;

public class ClubDepartment {
	 int idClubDepartment;
	    ClubMember manager;
	    List<ClubMember> coManagers;
	    String departmentName;
	    String responsibilityDescription;

	    public ClubDepartment(int idClubDepartment, ClubMember manager, List<ClubMember> coManagers, String departmentName,
	                          String responsibilityDescription) {
	        this.idClubDepartment = idClubDepartment;
	        this.manager = manager;
	        this.coManagers = coManagers;
	        this.departmentName = departmentName;
	        this.responsibilityDescription = responsibilityDescription;
	    }
	

}
