import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Tasks {

    public static void fillArr(ArrayList<Student> arr, int len){
        for (int i=0; i<len; i++){
            arr.add(Rand.createRand());
        }
    }

    public static void findbyFaculty(ArrayList<Student> arr, int len, String input){
        for (int i=0; i<len; i++){
            if (arr.get(i).getFaculty().equals(input)) {
                displayName(arr,i);
            }
        }
    }

    public static void findbyGroup(ArrayList<Student> arr, int len, String input) {
        for (int i = 0; i < len; i++) {
            if (arr.get(i).getGroup().equals(input)) {
                displayName(arr,i);
            }
        }
    }

    public static void findbyYear(ArrayList<Student> arr, int len, String input) {
        LocalDate data = LocalDate.parse("01.01."+input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        for (int i = 0; i < len; i++) {
            LocalDate date = LocalDate.parse(arr.get(i).getDateOfBirth(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            if (date.isAfter(data)) {
                displayName(arr,i);
            }
        }
    }

    public static void displayName(ArrayList<Student> arr, int addr){
        System.out.print("\n "+arr.get(addr).getName()+"\n ");
    }
}
