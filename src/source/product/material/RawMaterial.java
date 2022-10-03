package source.product.material;

/**
 * 原材料
 */
public class RawMaterial {
    /**
     * 铁矿
     */
    public static class Iron extends BaseMaterial {
        private final String name = "铁矿";

        @Override
        public String getName() {
            return name;
        }
    }

    public static class Copper extends BaseMaterial{
        private final String name = "铜矿";

        @Override
        public String getName() {
            return name;
        }
    }

}
