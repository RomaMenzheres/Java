package Actions;

import java.util.Scanner;
import DeryvatyvFactory.Deryvatyv;

public class Menu {

    public void insuranseOperation () {
        Deryvatyv obj = new Deryvatyv(11);
        Command Info = new DeryvatyvInfo(obj);
        Command Sort = new InitiateSort(obj);
        Command Find = new InitiateSearch(obj);
        Commands start = new Commands(Info, Find, Sort);
        Scanner enter = new Scanner(System.in);
        System.out.println("\nOur deryvatyv is completed! Let's do something with it");
        System.out.println("\nPress: \n1 - Watch deryvatyv info \n2 - Search insurance liability with parameters \n3 - Sort deryvatyv \n4 - Exit");

        while (true) {
            while (true) {
                int choice = enter.nextInt();
                switch (choice) {
                    case 1 -> start.DeryvatyvInfo();
                    case 2 -> start.Search();
                    case 3 -> start.Sort();
                    case 4 -> System.exit(0);
                    default -> {
                        System.out.println("Finishing");
                        System.exit(1);
                    }
                }
            }
        }
    }

    public void toBegin () {
        this.insuranseOperation();
    }
}
