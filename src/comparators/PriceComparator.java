package comparators;

import models.House;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
