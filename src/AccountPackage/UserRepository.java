package AccountPackage;

import java.util.*;

public class UserRepository {

	public UserRepository() {
		// create "database"
		users = new ArrayList<>();
	}

	// Temporary, acts as the database for testing purposes
	private List<User> users;

	// Store user in "database"
	public void addUser(User user) {
		// Checks if account already exists
		if (getUserByUsername(user.getAcctUsername()) != null) {
			throw new IllegalArgumentException("Account already exists.");
		}
		users.add(user);
	}

	// Retrieve user from database by ID
	public User getUserByID(int id) {
		// Checks each account in database
		for (User user : users) {
			if (user.getAcctID() == id) {
				return user; // Account found
			}
		}
		return null; // Account not found
	}

	// Retrieve user from database by username
	public User getUserByUsername(String username) {
		// Same as getUserByID
		for (User user : users) {
			if (user.getAcctUsername().equals(username)) {
				return user; // Account found
			}
		}
		return null; // Account not found
	}

}