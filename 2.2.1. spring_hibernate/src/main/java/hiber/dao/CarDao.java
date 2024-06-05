package hiber.dao;

import hiber.model.User;

public interface CarDao {
    User getUserCarModelAndSeries(String model, int series);
}