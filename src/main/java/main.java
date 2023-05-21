public class main {
    public static void main(String[] args) {
        ShopRepository repo = new ShopRepository();
        repo.add(new Product(1,"Молоко",1000));
        repo.add(new Product(2,"Чай",1000));
        repo.add(new Product(3,"Вата",1000));
        repo.remove(4);
    }
}
