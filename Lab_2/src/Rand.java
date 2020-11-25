import java.util.Random;

public class Rand {
    public static Student createRand() {
        final String[] names = {"Gaye Todd", "Elizabeth Ellen Gillease", "Peter Alexander ", "Horace Hinds", "Robert Patterson", "Lona Andre", "Martin Anthony Lunde", "Sarah Smith", "Launa Anderson", "Keith Anderson", "Criss Sarantakos"};
        final String[] births = {"24.09.2002", "12.03.2001", "17.05.2002", "25.12.2000", "14.02.2001", "16.04.2001", "28.08.2002", "22.01.2000", "06.06.2002", "02.11.2001", "09.07.2003"};
        final String[] addresses = {"777 Brockton Avenue, Abington MA 2351", "30 Memorial Drive, Avon MA 2322", "250 Hartford Avenue, Bellingham MA 2019", "700 Oak Street, Brockton MA 2301", "66-4 Parkhurst Rd, Chelmsford MA 1824", "591 Memorial Dr, Chicopee MA 1020", "55 Brooksby Village Way, Danvers MA 1923", "137 Teaticket Hwy, East Falmouth MA 2536", "42 Fairhaven Commons Way, Fairhaven MA 2719", "374 William S Canning Blvd, Fall River MA 2721", "121 Worcester Rd, Framingham MA 1701"};
        final String[] faculties = {"ComputerScience", "SoftwareEngineering"};
        final String[] groups = {"CN-204", "SE-305"};
        final String[] phoneNumbers = {"(779) 250-1260", "(651) 258-0552", "(752) 859-3392", "(993) 925-3448", "(798) 404-9403", "(637) 749-5946", "(391) 540-3049", "(728) 538-5305", "(615) 328-1650", "(308) 641-4018", "(874) 436-0303"};
        Random x = new Random();
        int id = x.nextInt(1000);
        String name = names[x.nextInt(11)];
        String birth = births[x.nextInt(11)];
        String address = addresses[x.nextInt(11)];
        String faculty = faculties[x.nextInt(2)];
        String group = groups[x.nextInt(2)];
        String phoneNumber = phoneNumbers[x.nextInt(11)];
        int course = x.nextInt(3) + 1;
        return new Student(id, course, phoneNumber, name, birth, address, faculty, group);
    }
}
