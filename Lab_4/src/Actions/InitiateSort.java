package Actions;

import DeryvatyvFactory.Deryvatyv;

public class InitiateSort implements Command {
    private final Deryvatyv deryvatyv;

    public InitiateSort (Deryvatyv deryvatyv) {
        this.deryvatyv = deryvatyv;
    }

    @Override
    public void execute () {
        System.out.println("\n\nLet's sort insurance liabilities in our deryvatyv! \n");
        Sort sort = new Sort();
        sort.toSort(this.deryvatyv);
        System.out.println("\n\nSorted deryvatyv:");
        this.deryvatyv.showInfo();
    }
}
