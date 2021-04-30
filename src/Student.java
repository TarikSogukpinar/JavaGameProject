public class Student extends User {
    private int studentsNumbers;


    public Student(int userId, int studentsNumbers, String userFirstName, String userLastName, String userAddress, String userEmailAddress, boolean status) {
        super(userId, userFirstName, userLastName, userAddress, userEmailAddress, status);
        this.setStudentsNumbers(studentsNumbers);
    }

    public int getStudentsNumbers() {
        return studentsNumbers;
    }

    public void setStudentsNumbers(int studentsNumbers) {
        this.studentsNumbers = studentsNumbers;
    }
}
