/***************************************
 * RAYMOND YANG
 * ZWEITES PROGRAMMIERPROJEKT
 * 25. OKT. 2017
 **************************************/

 public class ExerciseOne
 {
 	public static void main(String[] args)
 	{
 		 int buildSeasonHours = 600;
 		 String dedicationLevel;

     if(buildSeasonHours >= 300){
       dedicationLevel = "dedication on steroids";
     }
     else if (buildSeasonHours >= 200){
       dedicationLevel = "very dedicated";
     }
     else if (buildSeasonHours >= 150){
       dedicationLevel = "really dedicated";
     }
     else if (buildSeasonHours >= 120){
       dedicationLevel = "dedicated";
     }
     else if (buildSeasonHours >= 90){
       dedicationLevel = "average dedication";
     }
     else if (buildSeasonHours >= 50) {
       dedicationLevel = "undedicated";
     }
     else{
       dedicationLevel = "Eamon";
     }
     System.out.println("Your dedication level is:" + dedicationLevel);
 	}
 }


 public class ExerciseTwo
 {
 	public static void main(String[] args)
 	{
 		 boolean rightMotorMovingForward, leftMotorMovingForward, rightMotorMovingBackward, leftMotorMovingBackward, rightMotorNotMoving, leftMotorNotMoving;
 		 String movingStatus;
 		 rightMotorMovingForward = true;
 		 leftMotorMovingForward = true;
 		 rightMotorMovingBackward = false;
 		 leftMotorMovingBackward = false;
 		 rightMotorNotMoving = false;
 		 leftMotorNotMoving = false;

 		 if (rightMotorMovingForward && leftMotorMovingForward) {
 			 System.out.println("Die Maschine bewegt sich vorwärts");
 		 }
 		 else if ((rightMotorMovingForward && (leftMotorMovingBackward || leftMotorNotMoving)) || (rightMotorNotMoving && leftMotorMovingBackward)) {
 			 System.out.println("Die Maschine biegt nach rechts ab");
 		 }
 		 else if ((leftMotorMovingForward && (rightMotorNotMoving || rightMotorMovingBackward))|| (leftMotorNotMoving && rightMotorMovingBackward)) {
 			 System.out.println("Die Maschine biegt nach links ab");
 		 }
 		 else if(rightMotorMovingBackward && leftMotorMovingBackward) {
 			 System.out.println("Die Maschine bewegt sich rückwärts");
 		 }
 		 else if(rightMotorNotMoving && leftMotorNotMoving) {
 			 System.out.println("Die Maschine ist stationär");
 		 }
 		 else {
 			 System.out.println("Die Maschine ist Kaputt!");
 		 }
 	}

 }
