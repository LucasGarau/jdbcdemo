package com.liceu.cars.daos;

import com.liceu.cars.daos.CarDAO;

import java.util.List;

public class cardDAOOBJECTimplm implements CarDAO {
    static void initConnection(){

        String url = "jdbc:sqlite";
    }
    @Override
    public List<Car> getAll() {
        return null;
    }

    @Override
    public void add(Car c) {

    }

    @Override
    public void delete(Car c) {

    }

    @Override
    public void update(Car c) {

    }

    @Override
    public Car geFromId(int id) {
        return null;
    }

    @Override
    public List<Car> getCarsfromColors(String color) {
        return null;
    }
}
