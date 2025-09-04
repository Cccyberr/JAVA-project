import java.util.*;

// User class
class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}

// Game class
class Game {
    private String title;
    private String genre;
    private String platform;

    public Game(String title, String genre, String platform) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }
}

// Billing class
class Billing {
    public double calculateBill(double hourlyRate, int hours) {
        return hourlyRate * hours;
    }
}

public class GamingCafeManagementSystem {
    private List<User> users;
    private List<Game> games;

    public GamingCafeManagementSystem() {
        users = new ArrayList<>();
        games = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void displayUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println("Username: " + user.getUsername() + ", Role: " + user.getRole());
        }
    }

    public void displayGames() {
        System.out.println("Games:");
        for (Game game : games) {
            System.out.println("Title: " + game.getTitle() + ", Genre: " + game.getGenre() + ", Platform: " + game.getPlatform());
        }
    }

    public static void main(String[] args) {
        GamingCafeManagementSystem system = new GamingCafeManagementSystem();

        // Adding users
        system.addUser(new User("admin", "admin123", "Admin"));
        system.addUser(new User("manager", "manager123", "Manager"));

        // Adding games
        system.addGame(new Game("Call of Duty", "FPS", "PC"));
        system.addGame(new Game("FIFA 22", "Sports", "PS4"));

        // Displaying users and games
        system.displayUsers();
        system.displayGames();

        // Example of billing
        Billing billing = new Billing();
        double totalBill = billing.calculateBill(5.0, 3); // Assuming hourly rate is $5 and customer played for 3 hours
        System.out.println("Total Bill: $" + totalBill);
    }
}
