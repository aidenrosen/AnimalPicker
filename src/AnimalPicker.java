import java.util.Scanner;

public class AnimalPicker
{
	public static void main(String[] args)
	{
		String animal = askUser();

	}

	public static String askUser()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to see a dog or a cat?");

		switch(in.nextLine())
		{
			case "dog":
				System.out.println(" / \\__\n  (    @\\___\n  /         O\n /   (_____/\n/_____/   U");
				return "dog";
			case "cat":
				System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
				return "cat";
			default:
				System.out.println("Invalid response");
				break;
		}
		return askUser();
	}
}
