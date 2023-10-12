package maxondev;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> storeFromBuckets = new ArrayList<>();
    public void add(FlowerBucket flowerBucket) {
        storeFromBuckets.add(flowerBucket);
    }
    public FlowerBucket search(FlowerBucket flowersBucket) {
        for(FlowerBucket el: storeFromBuckets) {
            if(el.equals(flowersBucket)) {
                return el;
            }
        }
        return null;
    }
}
