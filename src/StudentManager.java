public class StudentManager extends UserManager {
    public void Add(Student student) {
        System.out.println("Öğrenci Eklendi " + student.getUserFirstName() + " " + student.getUserLastName());
    }

    public void Delete(Student student) {
        System.out.println("Öğrenci Silindi " + student.getUserFirstName() + " " + student.getUserLastName());
    }

    public void Update(Student student) {
        System.out.println("Öğrenci Güncellendi " + student.getUserFirstName() + " " + student.getUserLastName());
    }
}
