package SalesDatabase;

import SalesDatabase.entities.Customer;
import SalesDatabase.entities.Product;
import SalesDatabase.entities.Sale;
import SalesDatabase.entities.StoreLocation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("hibernateCodeFirst");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        Product product = new Product("product", 123, BigDecimal.TEN);
        Customer customer =
                new Customer( "customer", "asd", "12345");
        StoreLocation location = new StoreLocation( "location");
        Sale sale = new Sale(product, customer, location);

        entityManager.persist(product);
        entityManager.persist(customer);
        entityManager.persist(location);
        entityManager.persist(sale);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
