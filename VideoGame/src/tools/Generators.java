package tools;
import java.util.Random;
public class Generators {
   public static String nameGenerator (String gender) {
	   Random randGen = new Random();
	   String firstName = "";
	   String lastName = "";
	   String finalName = "";
	   String[] firstNameMaleList = {"James", "Robert", "John", "Michael", "David", "Willian", "Richard", "Joseph", "Thomas", "Charles",
			                     "Daniel", "Christopher", "Matthew", "Anthony", "Mark", "Donald", "Steven", "Paul", "Andrew", "Joshua",
			                     "Kenneth", "Kevin", "Brian", "George", "Timothy", "Ronald", "Edward", "Jason", "Jeffrey", "Ryan",
			                     "Jacob", "Gary", "Nicholas", "Eric", "Jonothan", "Stephen", "Larry", "Justin", "Scott", "Brandon",
			                     "Benjamin", "Samuel", "Gregory", "Alexander", "Frank", "Patrick", "Raymond", "Jack", "Dennis", "Jerry",
			                     "Tyler", "Aaron", "Jose", "Adam", "Nathan", "Henry", "Douglas", "Zachary", "Peter", "Kyle",
			                     "Ethan", "Walter", "Noah", "Jeremy", "Christian", "Keith", "Roger", "Terry", "Gerald", "Harold",
			                     "Sean", "Austin", "Carl", "Arthur", "Larence", "Dylan", "Jesse", "Jordan", "Bryan", "Billy",
			                     "Joe", "Bruce", "Gabriel", "Logan", "Albert", "Willie", "Alan", "Juan", "Wayne", "Elijah",
			                     "Randy", "Roy", "Vincent", "Ralph", "Eugene", "Russell", "Bobby", "Mason", "Philip", "Louis"};
	   
	   String[] firstNameFemaleList = {"Mary", "Patricia", "Jennifer", "Linda", "Elizabeth", "Barbara", "Susan", "Jessica", "Sarah", "Karen",
			                           "Lisa", "Nancy", "Betty", "Margaret", "Sandra", "Ashley", "Kimberly", "Emily", "Donna", "Michelle",
			                           "Carol", "Amanda", "Dorothy", "Melissa", "Deborah", "Stephanie", "Rebecca", "Sharon", "Laura", "Cynthia",
			                           "Kathleen", "Amy", "Angela", "Shirley", "Anna", "Brenda", "Pamela", "Emma", "Nicole", "Helen",
			                           "Samantha", "Katherine", "Christine", "Debra", "Rachel", "Carolyn", "Janet", "Catherine", "Maria", "Heather",
			                           "Diane", "Ruth", "Julie", "Olivia", "Joyce", "Virginia", "Victoria", "Kelly", "Lauren", "Christina",
			                           "Joan", "Evelyn", "Judith", "Megan", "Andrea", "Cheryl", "Hannah", "Jacqueline", "Martha", "Gloria",
			                           "Teresa", "Ann", "Sara", "Madison", "Frances", "Kathryn", "Janice", "Jean", "Abigail", "Alice",
			                           "Julia", "Judy", "Sophia", "Grace", "Denise", "Amber", "Doris", "Marilyn", "Danielle", "Beverly",
			                           "Isabella", "Theresa", "Diana", "Natalie", "Brittany", "Charlotte", "Marie", "Kayla", "Alexis", "Lori"};
	   
	   String[] lastNameList = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
			                    "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
			                    "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King",
			                    "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter",
			                    "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins",
			                    "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey",
			                    "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez",
			                    "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross",
			                    "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington",
			                    "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes"};
	   
	   if (gender.equals("Male")) {
		   firstName = firstNameMaleList[randGen.nextInt(firstNameMaleList.length)];
	   }
	   else if (gender.equals("Female")) {
		   firstName = firstNameFemaleList[randGen.nextInt(firstNameFemaleList.length)];
	   }
	   else if (gender.equals("Non-Binary") ) {
		   boolean maleOrFemaleName = randGen.nextBoolean();
		   if (maleOrFemaleName) {
			   firstName = firstNameMaleList[randGen.nextInt(firstNameMaleList.length)]; 
		   }
		   else {
			   firstName = firstNameFemaleList[randGen.nextInt(firstNameFemaleList.length)];
		   }
	   }
	   else {
		   System.out.println("Something went wrong, this entity probably does not have a gender!");
	   }
	   lastName = lastNameList[randGen.nextInt(lastNameList.length)];
	   finalName = firstName + " " + lastName;
	   return finalName;
   }
   public static String genderGenerator () {
	   Random randGen = new Random();
	   String gender;
	   String [] genderList = {"Male", "Female", "Non-Binary"};
	   gender = genderList[randGen.nextInt(3)];
	   return gender;
   }
}
