package sentinel;

public class StudentAverageUsingSentinelControlTest {

	public static void main(String[] args) {
		
		StudentAverageUsingSentinelControl gradebook = new StudentAverageUsingSentinelControl() ;
		gradebook.displayMessage("Intro to Java!") ;
		gradebook.determineClassAverage() ;

	}

}
