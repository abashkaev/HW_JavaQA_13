import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    ShopRepository repo = new ShopRepository();
    Product prod1 = new Product(1,"Молоко",1000);
    Product prod2 = new Product(2,"Чай",1000);
    Product prod3 = new Product(3,"Вата",1000);

    @BeforeEach
    public void setUp () {
    repo.add(prod1);
    repo.add(prod2);
    repo.add(prod3);
    }

    @Test
    public void removeIdTest() {

        repo.remove(2);

        Product[] expected = {prod1,prod3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeIdIfItNotHere() {

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(5);
        });
    }

}
