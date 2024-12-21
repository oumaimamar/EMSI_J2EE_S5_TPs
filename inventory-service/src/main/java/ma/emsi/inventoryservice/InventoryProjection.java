package ma.emsi.inventoryservice;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProduct",types = Product.class)
interface InventoryProjection extends Projection{
    public String getName();
    public double getPrice();
    public Long getId();
}
