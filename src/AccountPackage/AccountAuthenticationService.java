package AccountPackage;

import java.io.*;
import java.util.*;

public class AccountAuthenticationService {

	public AccountAuthenticationService() {
	}

	private UserRepository userRepo = new UserRepository();

	// Currently unused
	private int maxAttempts;

	// Logs in user with username and password
	public void login(String username, String password) {
		User user = userRepo.getUserByUsername(username);
		
		if (user == null) {
			throw new IllegalArgumentException("Account not found.");
		}
		
		if (user.getAcctPassword().equals(password)) {
			// Login is successful
			System.out.println("Login successful.");
		} else {
			throw new IllegalArgumentException("Incorrect credentials.");
		}
	}

	public void createAccount(String username, String password) {
		// MySQL will handle accountID creation, handled here for testing purposes
		int newID = (int)(Math.random() * 9000) + 1000;
		User newUser = new User(newID, username, password, "Standard");
		userRepo.addUser(newUser);
		System.out.println("Account created successfully.");
	}

	// This is not for if you forgot your password, real system would need something like that, potentially with email verification...
	public void changePassword(String username, String oldPass, String newPassword) {
		User user = userRepo.getUserByUsername(username);
		if (user == null) {
			throw new IllegalArgumentException("Account with associated Username not found.");
		}
		
		if (user.getAcctPassword().equals(oldPass)) {
			user.setAcctPassword(newPassword);
			System.out.println("Password updated successfully.");	
		} else {
			throw new IllegalArgumentException("Password incorrect. Failed to verify credentials.");
		}
	}

	public void logout(int accountID) {
		System.out.println("Logged out successfully.");
	}

}