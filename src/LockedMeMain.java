public class LockedMeMain {

    public static void main(String[] args) {

        FileOperations.createMainFolderIfNotPresent("main");

        MenuOptions.printWelcomeScreen("LockedMe", "Vamshidhar Reddy Gurappagari");

        HandleOptions.handleWelcomeScreenInput();
    }


}