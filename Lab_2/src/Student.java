public class Student {
    private int id, course;
    private String phoneNumber;
    private String name;
    private String dateOfBirth;
    private String address;
    private String faculty;
    private String group;


    public Student() {
        this.id = 0;
        this.phoneNumber = "0";
        this.course = 0;
        this.name = "0";
        this.dateOfBirth = "0";
        this.address = "0";
        this.faculty = "0";
        this.group = "0";
    }

    public Student(int i, int c, String p, String n, String b, String a, String f, String g) {
        id = i;
        course = c;
        phoneNumber = p;
        name = n;
        dateOfBirth = b;
        address = a;
        faculty = f;
        group = g;
    }

    public void setId(int new_id) {
        this.id = new_id;
    }

    public void setPhoneNumber(String new_phoneNumber) {
        this.phoneNumber = new_phoneNumber;
    }

    public void setCourse(int new_course) {
        this.course = new_course;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public void setDateOfBirth(String new_birth) {
        this.dateOfBirth = new_birth;
    }

    public void setAddress(String new_address) {
        this.address = new_address;
    }

    public void setFaculty(String new_faculty) {
        this.faculty = new_faculty;
    }

    public void setGroup(String new_group) {
        this.group = new_group;
    }

    public String toString() {
        return "\nStudent ID: " + this.id
                + "\nName: " + this.name
                + "\nDate of Birth: " + this.dateOfBirth
                + "\nAddress: " + this.address
                + "\nPhone number: " + this.phoneNumber
                + "\nFaculty: " + this.faculty
                + "\nCourse:  " + this.course
                + "\nGroup:  " + this.group
                + "\n---------------------------\n";
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

}

