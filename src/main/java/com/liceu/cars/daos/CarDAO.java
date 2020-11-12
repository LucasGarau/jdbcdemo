package com.liceu.cars.daos;
import com.liceu.cars.model.Car;

import java.util.List;

public interface  CarDAO {
    List<Car> getAll();
    void add(Car c);
    void delete(Car c);
    void update(Car c);
    Car geFromId(int id);
    List<Car> getCarsfromColors(String color);
}
