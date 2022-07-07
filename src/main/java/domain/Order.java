package domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    public Long id;
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    public String status;
    public List<Product> products;
}
