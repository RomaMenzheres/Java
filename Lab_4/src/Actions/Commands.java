package Actions;

public class Commands {
    private final Command DeryvatyvInfo;
    private final Command Search;
    private final Command Sort;

    public Commands(Command PresentInfo, Command Search, Command Sort) {
        this.DeryvatyvInfo = PresentInfo;
        this.Search = Search;
        this.Sort = Sort;
    }

    public void DeryvatyvInfo() {
        this.DeryvatyvInfo.execute();
    }

    public void Search() {
        this.Search.execute();
    }

    public void Sort() {
        this.Sort.execute();
    }

}
