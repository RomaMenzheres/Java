package DeryvatyvFactory.LiabilityFactory;

import java.util.Random;

public class LiabilityFactory {
    public LiabilityFactory() {
    }

    public static Liability createRandomLiability() {
        String[] names = new String[]{"Car sale", "House sale", "Garage sale", "Furniture sale", "Funds transfer", "Car insurance", "House insurance", "Life insurance", "Car exchange", "Funds exchange", "Health insurance"};
        Random x = new Random();
        String n = names[x.nextInt(11)];
        int c = x.nextInt(3000) + 11530;
        int r = x.nextInt(30) + 5;
        return new Liability(n, c, r);
    }
}
