import java.util.Scanner;

public class Adventure {
    Scanner scanner = new Scanner(System.in);

    boolean adventureMap = true;

    public String userInput() {
        String userInput = scanner.nextLine();
        return userInput;
    }

    public void quest () {
        System.out.println("Go North");
        System.out.println("Go South");
        System.out.println("Go East");
        System.out.println("Go West");
        System.out.println("quit");
    }

    public void adventureMap() {
        while (adventureMap) {

            quest();
            String userInput = userInput();
            String response = adventureInput(userInput);
            //String adventureInput = adventureInput();
            if (response.equals("The end")) {
                System.out.println("system ");
                adventureMap = false;
            } else {
                System.out.println(response);
            }
        }
    }

    public String adventureInput(String day) {
        return switch (day) {
            case "Go North" -> "Going North";
            case "Go south" -> "Going South";
            case "Go east" -> "Going East";
            case "Go west" -> "Going West";
//            case "quit" -> {
//                adventureMap = false;
//                yield " the end ";
//            }
            case "quit" -> "The end";
            default -> "invalid input";
        };
    }


}
