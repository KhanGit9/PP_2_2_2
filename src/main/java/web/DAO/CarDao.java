package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCarList(int count);
}
