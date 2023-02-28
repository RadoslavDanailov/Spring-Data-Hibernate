package com.example.springxmlhomework;

import com.example.springxmlhomework.entities.products.ExportProductsInRangeDto;
import com.example.springxmlhomework.entities.users.ExportSellersDTO;
import com.example.springxmlhomework.entities.users.ExportSellersWithCountsDTO;
import com.example.springxmlhomework.services.ProductsService;
import com.example.springxmlhomework.services.SeedService;
import com.example.springxmlhomework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@Component
public class ProductShopRunner implements CommandLineRunner {

    private final SeedService seedService;
    private final ProductsService productsService;
    private final UserService userService;

    @Autowired
    public ProductShopRunner(SeedService seedService, ProductsService productsService, UserService userService) {
        this.seedService = seedService;
        this.productsService = productsService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
//        this.seedService.seedProducts();

//        this.productsInRange();


    }


    private void findUserWithSoldProducts() throws JAXBException {
        ExportSellersDTO result = this.userService.findAllWithSoldProducts();

        JAXBContext context = JAXBContext.newInstance(ExportSellersDTO.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(result, System.out);
    }

    private void productsInRange() throws JAXBException {
        ExportProductsInRangeDto inRange = this.productsService.getInRange(500, 1000);

        JAXBContext context = JAXBContext.newInstance(ExportProductsInRangeDto.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(inRange, System.out);
    }
}
