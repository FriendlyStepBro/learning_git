public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService() {
        users = new ArrayList<>();
        users.add(new User("John", "Password"));
    }
    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null; // Username already taken
            } 
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser; // Successfully signed up
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Successfully logged in
            }
        }
        return null; // Invalid credentials
    }
}