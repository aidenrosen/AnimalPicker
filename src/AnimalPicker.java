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
				System.out.println("DOG ASCII ART HERE");
				return "dog";
			case "cat":
				System.out.println("CAT ASCII ART HERE");
				return "cat";
			default:
				System.out.println("Invalid response");
				break;
		}
		return null;
	}
}
