public class Main {
    public static void main(String[] args){
        Game game = new Game(1,"Football Manager",250,"Sports Interactive","SEGA");
        User user = new User("1000000","Bahar","Gorgun","2000");
        System.out.println(user.toString());

        UserManager userManager = new UserManager();
        userManager.add(user);

        Campaign campaign = new Campaign(5,"Bahar Kampanyası",25);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.sale(campaign,game);

        GameManager gameManager = new GameManager();
        gameManager.add(game);

        }

    }

