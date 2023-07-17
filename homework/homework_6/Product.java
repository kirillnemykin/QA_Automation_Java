package homework.homework_6;

public class Product {
    private String name;
    private int article;
    private double price;
    private String description;
    private boolean isPresent;

    public Product(String name, int article, double price, String description, boolean isPresent) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.description = description;
        this.isPresent = isPresent;
    }

    public Product(String name, int article, double price, boolean isPresent) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public int getArticle() {
        return article;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
