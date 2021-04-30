import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        menuNav.Menu();

        User user = new User(1, "Tarik", "Sogukpınar", "Konya", "ledunv@protonmail.com", true);
        Instructor instructor = new Instructor(1, 2, "Engin", "Demiroğ", "Ankara", "engindemiroğ@gmail.com", true);
        Student student = new Student(3, 1, "Yasin", "Sogukpınar", "Istanbul", "blank@hotmail.com", true);

        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();


        System.out.println(Messages.userName);
        String username = scanner.next();
        System.out.println(Messages.email);
        String email = scanner.next();
        final String[] checkUserNameAndEmail = {user.getUserFirstName(), user.getEmailAddress(), instructor.getUserFirstName(), instructor.getEmailAddress()};

        if (username.equals(checkUserNameAndEmail[0]) && email.equals(checkUserNameAndEmail[1])) {
            userMenuTitle(username);
            int inputUserAnswer = scanner.nextInt();
            switch (inputUserAnswer) {
                case 1 -> getActiveCourse();
                case 2 -> getPassiveCourse();
                default -> System.out.println(Messages.youDontHaveChoose);
            }

        } else if (username.equals(checkUserNameAndEmail[2]) && email.equals(checkUserNameAndEmail[3])) {
            managerMenuTitle(username);
            int inputInstructorAnswer = scanner.nextInt();
            switch (inputInstructorAnswer) {
                case 1 -> getActiveCourse();
                case 2 -> courseAdded(scanner);
                case 3 -> deleteCourse(scanner);
                case 4 -> userManager.Add(user);
                case 5 -> instructorManager.Add(instructor);
                case 6 -> studentManager.Add(student);
                case 7 -> getAllSystemUsers(user, instructor, student);
                default -> System.out.println(Messages.youDontHaveChoose);
            }
        } else {
            System.out.println(Messages.accessDenied);
        }

    }

    private static void getAllSystemUsers(User user, Instructor instructor, Student student) {
        User[] users = {user, student, instructor};
        for (User user1 : users) {
            System.out.println(user1.getUserId() + " " + user1.getUserFirstName() + " " + user1.getUserLastName() + " " + user1.getUserAddress() + " " + user1.getEmailAddress());
        }
    }

    private static void managerMenuTitle(String username) {
        System.out.println(Messages.welcomeAdminMessage + " " + username);
        System.out.println(Messages.accessSuccessFull + " " + Messages.makeChoose);
        System.out.println(Messages.showActiveCourse);
        System.out.println(Messages.addCourse);
        System.out.println(Messages.deleteCourse);
        System.out.println(Messages.addUser);
        System.out.println(Messages.addInstructor);
        System.out.println(Messages.addStudent);
        System.out.println(Messages.getAllStudent);
    }

    private static void userMenuTitle(String username) {
        System.out.println(Messages.welcomeMessage + " " + username);
        System.out.println(Messages.accessSuccessFull);
        System.out.println(Messages.courseWelcome + " " + Messages.makeChoose);
        System.out.println(Messages.showActiveCourse);
        System.out.println(Messages.nextCourse);
    }

    private static void getPassiveCourse() {
        Course course1 = new Course(Messages.csharpAngularMessage, Messages.backEndMessage);
        Course course2 = new Course(Messages.javaReactMessage, Messages.backEndMessage);
        Course course3 = new Course(Messages.pythonVueMessage, Messages.backEndMessage);
        Course course4 = new Course(Messages.javaScriptVueMessage, Messages.backEndMessage);
        Course[] courses = {course1, course2, course3, course4};
        for (Course course : courses) {
            System.out.println(course.courseName + course.courseType);
        }
    }

    private static void getActiveCourse() {
        ActiveCourse activeCourse1 = new ActiveCourse(Messages.csharpAngularMessage, Messages.backEndMessage);
        ActiveCourse activeCourse2 = new ActiveCourse(Messages.javaReactMessage, Messages.backEndMessage);
        ActiveCourse[] activeCourses = {activeCourse1, activeCourse2};
        for (ActiveCourse activeCourse : activeCourses) {
            System.out.println(activeCourse.courseName + activeCourse.courseType);
        }
    }


    private static void deleteCourse(Scanner scanner) {
        ActiveCourse activeCourse = new ActiveCourse();
        System.out.println(Messages.courseName + Messages.courseType);
        String deleteCourseName = scanner.next();
        String deleteCourseName1 = scanner.next();
        System.out.println(deleteCourseName + " " + deleteCourseName1);
        activeCourse.Delete();
    }

    private static void courseAdded(Scanner scanner) {
        ActiveCourse activeCourse = new ActiveCourse();
        System.out.println(Messages.courseName + " " + Messages.courseType);
        String courseName = scanner.next();
        String courseName1 = scanner.next();
        System.out.println(courseName + " " + courseName1);
        activeCourse.Add();
    }


}



