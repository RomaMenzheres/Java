package Actions;
import DeryvatyvFactory.Deryvatyv;
import DeryvatyvFactory.LiabilityFactory.Liability;

import java.util.Comparator;

public class Sort {
    public Sort () {
    }

    public void toSort (Deryvatyv obj) {
        obj.getArr().sort(Comparator.comparingInt(Liability::getRisk));
    }
}