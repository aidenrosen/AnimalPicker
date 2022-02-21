import java.util.Scanner;

public class AnimalPicker
{
	public static void main(String[] args)
	{
		String animal = askUser();
		switch(animal)
		{
			case "dog":
				System.out.println("DOG ASCII ART HERE");
				break;
			case "cat":
				System.out.println("CAT ASCII ART HERE");
				break;
		}
	}

	public static String askUser()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to see a dog or a cat?");
		return in.nextLine().toLowerCase();
	}
}
