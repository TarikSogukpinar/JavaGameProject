public class Instructor extends User {
    private int InstructorId;


    public Instructor(int InstructorId, int userId, String userFirstName, String userLastName, String userAddress, String userEmailAddress, boolean status) {
        super(userId, userFirstName, userLastName, userAddress, userEmailAddress, status);
        this.setInstructorId(InstructorId);

    }

    public int getInstructorId() {
        return InstructorId;
    }

    public void setInstructorId(int instructorId) {
        InstructorId = instructorId;
    }
}
