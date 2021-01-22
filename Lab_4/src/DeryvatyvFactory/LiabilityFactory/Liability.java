package DeryvatyvFactory.LiabilityFactory;

public class Liability implements LiabilityInter {
    protected String name;
    protected int cost;
    protected int risk;

    public Liability(String name, int cost, int risk) {
        this.name = name;
        this.cost = cost;
        this.risk = risk;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getRisk() {
        return this.risk;
    }

    @Override
    public void setRisk(int risk) {
        this.risk = risk;
    }

    public String toString() {
        String var10000 = this.getName();
        return "\nInsurance liability: " + var10000 + " Cost: " + this.getCost() + " Level of risk: " + this.getRisk() + "% ";
    }
}
