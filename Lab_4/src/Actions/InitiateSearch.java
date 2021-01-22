package Actions;

import java.util.Scanner;
import DeryvatyvFactory.Deryvatyv;

public class InitiateSearch implements Command {
    private final Deryvatyv deryvatyv;
    int begin;
    int end;

    public InitiateSearch (Deryvatyv deryvatyv) {
        this.deryvatyv = deryvatyv;
    }

    @Override
    public void execute () {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nSet risk % range for insurance liabilities in deryvatyv to look for: ");
        this.begin = scan.nextInt();
        this.end = scan.nextInt();
        Search search = new Search();
        search.toSearch(this.deryvatyv, this.begin, this.end);
        System.out.println("\nInsurance liabilities which suit our risk % range ( " + this.begin + "-" + this.end + " )");
    }
}
