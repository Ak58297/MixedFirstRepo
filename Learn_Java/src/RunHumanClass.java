
public class RunHumanClass {

	public RunHumanClass() {
		System.out.println("I am in sonstructor for RunHumanclass");
	}

	public static void main(String[] args) {

		RunHumanClass ob1 = new RunHumanClass();
		HumanClass ob = new HumanClass();
		HumanClass ob11 = new HumanClass("Name", 33, 7, "Wipro", "Good");
		ob.IdentifyHuman();

	}

}
