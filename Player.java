package draft;


//begin player class
public class Player {
//declare global instance variables
	public String name;
	public String position;
	public int age;
	public String height;
	public String weight;
	public int bmi; 
	public String college;
	public String experience;
	public String homeTown;
	public String currentTeam;
	
	
	//empty constructor
	public Player () { }
	//player constructor that accepts all parameters
	public Player (String nameIn, String positionIn, int ageIn, String heightIn, String weightIn, int bmiIn, String collegeIn, String experienceIn, String homeTownIn, String currentTeamIn) {
		//assign the value of _In to the _class instance variable
		name = nameIn;
		position = positionIn;
		age = ageIn;
		height = heightIn;
		weight = weightIn;
		bmi = bmiIn;
		college = collegeIn;
		experience = experienceIn;
		homeTown = homeTownIn;
		currentTeam = currentTeamIn;
	}
	//getters and setters for all parameters
		public void setName(String nameIn) {
			this.name = nameIn;
		}
		public String getName() {
			return this.name;
		}
		public void setPosition (String positionIn) {
			this.position = positionIn;
		}
		public String getPosition() {
			return this.position; 
		}
		public void setAge(int ageIn) {
			this.age = ageIn;
		}
		public int getAge() {
			return this.age;
		}
		public void setHeight(String heightIn) {
			this.height = heightIn;
		}
		public String getHeight() {
			return this.height;
		}
		public void setWeight(String weightIn) {
			this.weight = weightIn;
		}
		public String getWeight() {
			return this.weight;
		}
		public void setBmi(int bmiIn) {
			this.bmi = bmiIn;
		}
		public int getBmi() {
			return this.bmi;
		}
		public void setCollege(String collegeIn) {
			this.college = collegeIn;
		}
		public String getCollege() {
			return this.college;
		}
		public void setExperience(String experienceIn) {
			this.experience = experienceIn;
		}
		public String getExperience() {
			return this.experience;
		}
		public void setHomeTown(String homeTownIn) {
			this.homeTown = homeTownIn;
		}
		public String getHomeTown() {
			return this.homeTown;
		}
		public void setCurrentTeam(String currentTeamIn) {
			this.currentTeam = currentTeamIn;
		}
		public String getCurrentTeam() {
			return this.currentTeam;
		}
		//add main method and test constructors, getters, and setters.
		public static void main(String[] args) {
			Player tbrady = new Player();
			tbrady.setName("Tom Brady");
			System.out.println("Testing: " + tbrady.toString());
			
			Player khunt = new Player("Kareem Hunt", "RB", 22, "5FT 10IN", "216 LBS", 0, "Toledo", "2nd Season", "Elyria, OH", "Kansas City Chiefs");
			khunt.setAge(25);
			
			System.out.println("Testing: " + khunt.getName() + " is not " + khunt.getAge() + " years old, but he does weigh " + khunt.getWeight());
		}
		

}

