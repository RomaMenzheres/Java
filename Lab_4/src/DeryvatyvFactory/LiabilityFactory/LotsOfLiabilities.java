package DeryvatyvFactory.LiabilityFactory;

import java.util.ArrayList;
import java.util.List;

public class LotsOfLiabilities {
    public LotsOfLiabilities() {
    }

    public static List<Liability> createLots() {
        List<Liability> Arr = new ArrayList();

        for(int i = 0; i < 30; ++i) {
            System.out.println("\nSetting insurance liability №" + (i + 1));
            Arr.add(LiabilityFactory.createRandomLiability());
            System.out.println(Arr.get(Arr.size() - 1));
        }

        return Arr;
    }
}
