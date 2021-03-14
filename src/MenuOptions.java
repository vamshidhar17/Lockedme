public class MenuOptions {

    public static void printWelcomeScreen(String appName, String developerName) {
        String projectDetails = String.format("Welcome to %s.com. \n" + "This application is developed by %s.", appName, developerName);
        System.out.println(projectDetails);
    }

    public static void displayMenu() {
        String menu = "\nSelect any option number from below and press Enter\n"
                + "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
                + "3) Exit program";
        System.out.println(menu);

    }

    public static void displayFileMenuOptions() {
        String fileMenu = "\nSelect any option number from below and press Enter\n"
                + "1) Add a file with \".txt\" extension to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
                + "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program";

        System.out.println(fileMenu);
    }
}
