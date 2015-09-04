package ru.qom.api.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qom.api.dao.repository.BoxRepository;

/**
 * Created by Тимакс on 05.09.2015.
 */
@Service("boxDAO")
public class BoxDAO {
    @Autowired
    BoxRepository boxRepository;


    public void findByAccountUsername() {
        return;
    }
}
