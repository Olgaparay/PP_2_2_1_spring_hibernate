package hiber.service;

import hiber.model.User;

public interface CarService {
    User getUserCarModelAndSeries(String model, int series);
}
