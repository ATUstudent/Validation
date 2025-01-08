package ie.atu.Validation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> productList = new ArrayList<>();
    @GetMapping("/getProducts")
    public List<Product> getProducts()
    {
        return productList;
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@Valid @RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }
}
