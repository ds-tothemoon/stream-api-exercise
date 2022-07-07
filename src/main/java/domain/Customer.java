package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer {
    public Long id;
    public String name;
    public Integer tier;
    public List<Order> orders;

}
