public class InstructorManager extends UserManager {
    public void Add(Instructor instructor) {
        System.out.println("Eğitmen Eklendi " + instructor.getUserFirstName() + " " + instructor.getUserLastName());
    }

    public void Delete(Instructor instructor) {
        System.out.println("Eğitmen Silindi " + instructor.getUserFirstName() + " " + instructor.getUserLastName());
    }

    public void Update(Instructor instructor) {
        System.out.println("Eğitmen Güncellendi " + instructor.getUserFirstName() + " " + instructor.getUserLastName());
    }
}
