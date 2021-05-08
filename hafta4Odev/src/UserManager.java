
import Odev4.CTMDateTimeConverter;

public class UserManager implements UserService {
   private UserCheckService userCheckService;

    @Override
    public void add(User user) {
        if(userCheckService.checkIfRealPerson(user)){
            System.out.println("Kullanıcı eklendi: " + user.getFirstName());
        }else{
            System.out.println("Kullanıcı eklenemedi :" + user.getFirstName());
        }

    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı güncellendi" + user.getFirstName());

    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı silindi" + user.getFirstName());

    }
}
