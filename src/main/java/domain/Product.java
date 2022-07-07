package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    public Long id;
    public String name;
    public String category;
    public Double price;
}
