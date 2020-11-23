
public class myApp {

	public static void main(String[] args) {
		
		//  Creating variable and assign them values 
		
		float itemPrice = 10.10f;
		int totalMoney = 600;
		int numFriends = 2;
		int age = 30;
		double newAmount= totalMoney - itemPrice;
		int totalNumOfFriends = numFriends * age;
		
		String firstName = "Basim";
		String lastName = "Alali";
		String mInitial = "K";
		
		//  performing operations (addition, subtraction, concatenation)
		// a.New amount of money in wallet after buying the item
			System.out.println("My New amount of money in wallet after buying the item is"+ " " + newAmount);
			
		// b.Number of friends you’ve made each year based on your age variable and your number of friends variable
			System.out.println("I have made"+ " " + totalNumOfFriends + " "+ "friends based on multiplication");
			System.out.println(age + numFriends + " " + "friends based on addtion");

		// c.Full name based on first name, middle initial, and last name
			System.out.println("My full name is" + " " + firstName + " " + mInitial + " " + lastName);
			
		// printing out the values of all the variables 
		
		// Printing Item Price 
			System.out.println("My Item Price" + " " + itemPrice);
			
		// Printing total Amount of money in wallet
			System.out.println("My total Money is" + " " + totalMoney);
			
		//	Printing Number of friends
			System.out.println("I made" + " " + numFriends + " " + "friends each year");
			
		//Printing Age in years
			System.out.println("I am" + " " + age + " "+ "years old");
			
		// Printing First Name 	
			System.out.println("My first Name is" + " " + firstName);
			
		// Printing Last Name 	
			System.out.println("My last name is" + " " + lastName);
			
		// Printing Middle initial		
			System.out.println("My middle initial name is" + " " + mInitial);
			
		// Printing the variable that holds the New amount of money in wallet after buying the item	
			System.out.println("My New amount of money in wallet after buying the item is" + " " + newAmount);
			
		// Printing number of friends variable 
			System.out.println("Today, I have" + " " + totalNumOfFriends + " "+ "friends");
		
		// printing full name variable 
			System.out.println("My full name is" + " " + firstName + " " + mInitial + " " + lastName);
			
			
	}

}
