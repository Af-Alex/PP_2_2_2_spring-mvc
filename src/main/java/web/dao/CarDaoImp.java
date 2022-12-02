package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    List<Car> cars = Arrays.asList(new Car("Audi", 1, "red"),
                                   new Car("Hyundai", 3, "blue"),
                                   new Car("Mazda", 14, "orange"),
                                   new Car("Opel", 5, "grey"),
                                   new Car("Skoda", 8, "mint"));

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> get(int count) {

        if (count >= 5) {
            return cars;
        } else {
            List<Car> countedCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                countedCars.add(cars.get(i));
            }
            return countedCars;
        }
    }
}
