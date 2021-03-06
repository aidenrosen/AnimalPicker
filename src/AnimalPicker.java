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
		System.out.println("Would you like to see a dog, cat, or fish?");

		switch(in.nextLine().toLowerCase())
		{
			case "dog":
				System.out.println(" / \\__\n  (    @\\___\n  /         O\n /   (_____/\n/_____/   U");
				return "dog";
			case "cat":
				System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
				return "cat";
			case "fish":
				System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
				return "fish";
			default:
				System.out.println("Invalid response");
				break;
		}
		return askUser();
	}
}
