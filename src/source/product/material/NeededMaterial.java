package source.product.material;

import java.math.BigDecimal;

public class NeededMaterial {
    public BaseMaterial material;
    public BigDecimal number;

    public NeededMaterial(BaseMaterial material, BigDecimal number) {
        this.material = material;
        this.number = number;
    }
}
