public class UserManager {

    public void Add(User user) {

        System.out.println("Kullanıcı Eklendi " + user.getUserFirstName() + " " + user.getUserLastName());
    }

    public void Delete(User user) {
        System.out.println("Kullanıcı Silindi " + user.getUserFirstName() + " " + user.getUserLastName());
    }


    public void Update(User user) {
        System.out.println("Kullanıcı Güncellendi " + user.getUserFirstName() + " " + user.getUserLastName());
    }


}
