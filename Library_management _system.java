import java.util.Scanner;
public class Final_project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean looping = true;
		int[] books_avail = {8, 10, 4};
		String [] available_books = {"Javascript programming", "intro to Java", "Python for data science"};
		while (looping == true) {
			System.out.println("Welcome to our Library management System.");
			System.out.println("1. Display our available books on programming languages \n"
			+ "2. Borrow our books \n" + "3. Return our books \n" + "4. Exit \n");
			System.out.print("Enter your choice: ");
			int option = input.nextInt();
			System.out.println();
			
			switch (option) {
			case 1 : 
				System.out.println("Available books: ");
				books(books_avail, available_books);
				System.out.println();
				break;
			
			case 2 :
				System.out.println();
				System.out.print("Enter the book name: ");
				String book_choice = input.nextLine();
				String book_choice1 = input.nextLine();
				borrowing(book_choice1, books_avail, available_books);
				break;
			
			case 3 :
				System.out.print("Enter the book name: ");
				String book_choice2 = input.nextLine();
				String book_choice3 = input.nextLine();
				returning(book_choice3, books_avail, available_books);
				break;
			
			case 4 :
				looping = false;
				break;
			
			default :
				System.out.println("Wrong input. \n");
				break;
			}
			
		}
		System.out.println("Thank you for using our Library management system! \nHave a good day!");
		
	}
	
	
	
	
	
	
	public static void books(int [] avails, String [] booknames) {
		for (int i = 0; i < booknames.length; i++)
		System.out.println(booknames[i] + " : " + avails[i]);
	}
	
	
	
	
	
	
	public static void borrowing(String in, int [] avails, String [] booknames) {
		for (int a = 0; a < booknames.length; a++) {
			if (in.length() == (booknames[a].length()))
			{
				if (in.equals(booknames[a])) {
					System.out.println("You have borrowed one copy of " + in + "\n");
					avails[a] -= 1;
				}
			}
		}
	}
	
	
	
	
	
	public static void returning(String in, int [] avails, String [] booknames) {
		for (int a = 0; a < booknames.length; a++) {
			if (in.length() == (booknames[a].length()))
			{
				if (in.equals(booknames[a])) {
					System.out.println("You have returned one copy of " + in + "\n");
					avails[a] += 1;
				}
			}
		}
	}
}
