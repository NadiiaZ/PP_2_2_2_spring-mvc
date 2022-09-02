package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("Suzuki", "SX4", 2012));
        cars.add(new Car("Toyota", "Yaris", 2019));
        cars.add(new Car("Audi", "A5", 2020));
        cars.add(new Car("Nissan", "Juke", 2021));
        cars.add(new Car("Mazda", "9", 2018));
    }
    @Override
    public List<Car> showCars(int count) {
        if (count < 5 && count > 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
