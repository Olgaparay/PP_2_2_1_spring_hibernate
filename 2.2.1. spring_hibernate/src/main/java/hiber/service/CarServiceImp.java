package hiber.service;

import hiber.dao.CarDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class CarServiceImp  implements CarService{
    @Autowired
    private CarDao carDao;

    @Transactional
    @Override
    public User getUserCarModelAndSeries(String model, int series) {
        return carDao.getUserCarModelAndSeries(model, series);
    }
}
