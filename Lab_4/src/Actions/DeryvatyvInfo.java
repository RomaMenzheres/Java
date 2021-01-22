package Actions;

import DeryvatyvFactory.Deryvatyv;
public class DeryvatyvInfo implements Command {
    private final Deryvatyv deryvatyv;

    public DeryvatyvInfo (Deryvatyv deryvatyv) {
        this.deryvatyv = deryvatyv;
    }

    @Override
    public void execute() {
        this.deryvatyv.DeryvatyvInfo();
    }
}
