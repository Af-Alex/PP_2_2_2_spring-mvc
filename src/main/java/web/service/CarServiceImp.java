package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getCars(int count) {
       return carDao.get(count);
    }
}
