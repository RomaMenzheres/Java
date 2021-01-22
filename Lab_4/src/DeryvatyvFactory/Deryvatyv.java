package DeryvatyvFactory;

import DeryvatyvFactory.LiabilityFactory.Liability;
import DeryvatyvFactory.LiabilityFactory.LotsOfLiabilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Deryvatyv {
    private final List<Liability> P = new ArrayList();

    public Deryvatyv(int i) {
        this.createDeryvatyv();
    }

    public List<Liability> getArr() {
        return this.P;
    }

    private void createDeryvatyv() {
        List<Liability> M = LotsOfLiabilities.createLots();
        this.fillPresent(M);
    }

    public void fillPresent(List<Liability> arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nSet how much insurance liabilities to set into our deryvatyv: ");
        int size = scan.nextInt();
        --size;
        Random r = new Random();

        for(int i = 0; i < size; ++i) {
            this.P.add((Liability)arr.get(r.nextInt(arr.size() - 1)));
        }

    }

    public void showInfo() {
        for(int i = 0; i < this.getArr().size(); ++i) {
            System.out.println(this.getArr().get(i));
        }
    }

    public int estimateCost() {
        int current_c = 0;

        for(int i = 0; i < this.getArr().size(); ++i) {
            current_c += ((Liability)this.getArr().get(i)).getCost();
        }

        return current_c;
    }

    public void DeryvatyvInfo() {
        System.out.println("\n\nOur deryvatyv:");
        this.showInfo();
        System.out.printf("\n\nOur deryvatyv total cost is %d\n", this.estimateCost());
    }
}
