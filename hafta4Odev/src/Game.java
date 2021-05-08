public class Game {
    int id;
    String name;
    int price;
    String developer;
    String platform;


    public Game(){

    }

    public Game(int id, String name, int price, String developer, String platform) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.developer = developer;
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
