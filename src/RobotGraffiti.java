import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot walle=new Robot();
	walle.penDown();
	walle.setSpeed(9000);
	walle.move(200);
	walle.turn(140);
	walle.move(200);
	walle.turn(250);
	walle.move(200);
	walle.turn(150);
	walle.move(200);
	walle.turn(270);
	walle.penUp();
	walle.move(70);
	walle.penDown();
	walle.turn(300);
	walle.move(200);
	walle.move(-100);
	walle.turn(90);
	walle.move(100);
	walle.move(-200);
}
}
