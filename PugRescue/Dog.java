public class Dog {
	// instance variables
	private String name;
	private String breed;

	// constructors
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public Dog(String name) {
		this(name, "Pug");
	}
	
	// getters
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}
	
	// setters

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	// methods

	public boolean equals(Dog other) {
		return this.name.equals(other.getName()) 
				&& this.breed.equals(other.getBreed());
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}


	
	
	
}
