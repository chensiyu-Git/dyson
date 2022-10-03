package source.product.material;

import java.math.BigDecimal;

public class IronNugget extends BaseMaterial{
    private final String name = "铁矿";

    private final NeededMaterial formula1 = new NeededMaterial(new RawMaterial.Iron(), BigDecimal.valueOf(2));

    @Override
    public String getName() {
        return name;
    }
}
