package Actions;

import DeryvatyvFactory.Deryvatyv;
import DeryvatyvFactory.LiabilityFactory.Liability;

public class Search {
    public Search () {
    }

    public void toSearch(Deryvatyv obj, int begin, int end) {
        for(int i = 0; i < obj.getArr().size(); ++i) {
            int risk = ((Liability)obj.getArr().get(i)).getRisk();
            if (begin <= risk && end >= risk) {
                System.out.println(obj.getArr().get(i));
            }
        }
    }
}