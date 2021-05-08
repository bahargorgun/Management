public class CampaignManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + "adlı kampanya uygulandı" );
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println( campaign.getName() + "adlı kampanya güncellendi");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + "adlı kampanya silindi");

    }

    @Override
    public void sale(Campaign campaign, Game game) {
        int yeniFiyat = game.getPrice()-(game.getPrice()* campaign.getDiscountRate()/100);
        System.out.println(game.getName() + "adlı oyuna" + campaign.getDiscountRate() + "oranında indirim uygulandı"
        + "Eski fiyat : " + game.getPrice() + "Yeni fiyat :" + yeniFiyat);


    }
}
