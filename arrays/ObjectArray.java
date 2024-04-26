package collections.arrays;

class Category {
    int id;
    String name;
    String iconUrl;

    public Category(int id, String name, String iconUrl) {
        this.id = id;
        this.name = name;
        this.iconUrl = iconUrl;
    }
}
public class ObjectArray {
    public static void main(String[] args) {
       Category[] categories = new Category[10];
       categories[0] = new Category(1, "electricity", "someurl");
       System.out.println(categories[0].name); // electricity
    }
}
