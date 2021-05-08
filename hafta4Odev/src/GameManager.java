public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName() + "kütüphaneye eklendi");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + "güncellendi");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + "kütüphanenizden silindi");
    }

    @Override
    public void sell(Game game, User user) {
        System.out.println(game.getName() + "adlı oyun" + user.getFirstName() + "kullanıcısı tarafından satın alındı.");
    }

}
