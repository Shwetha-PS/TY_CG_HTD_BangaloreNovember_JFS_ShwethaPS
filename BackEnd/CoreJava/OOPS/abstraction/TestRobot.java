package abstractionrobot;

public class TestRobot
{
	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.move();
		r1.talk();
		
		Moment r2 = new Robot();
		r2.move();
		//r1.talk();   Only Movement interface implementation can be accessed
	
	}

}
