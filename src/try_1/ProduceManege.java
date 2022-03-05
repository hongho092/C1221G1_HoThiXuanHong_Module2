package try_1;

import java.util.ArrayList;
import java.util.List;

public class ProduceManege {
    private List<Produce> produces = new ArrayList<>();

    public ProduceManege(List<Produce> produces) {
        this.produces = produces;
    }

    public ProduceManege() {
    }

    public List<Produce> getProduces() {
        return produces;
    }

    public void setProduces(List<Produce> produces) {
        this.produces = produces;
    }

    public void showProduce () {
        for (Produce produce : getProduces()) {
            System.out.println(produce);
        }
    }

    public void addProduct (Produce produce) {
        this.produces.add(produce);
    }
}
