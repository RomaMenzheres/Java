import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int len;
        String input;
        ArrayList<Student> arr=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        len = scan.nextInt();
        arr.ensureCapacity(len);
        Tasks.fillArr(arr, len);
        System.out.print("Full list of our students:\n");
        System.out.println(arr);

        System.out.print("\n\nPut the faculty whom students you want to find: ");
        input = scan.next();
        Tasks.findbyFaculty(arr, len, input);

        System.out.print("\n\nPut the group whom students you want to find: ");
        input = scan.next();
        Tasks.findbyGroup(arr, len, input);

        System.out.print("\n\nPut the min birth year of students you find: ");
        input = scan.next();
        Tasks.findbyYear(arr, len, input);
    }
}