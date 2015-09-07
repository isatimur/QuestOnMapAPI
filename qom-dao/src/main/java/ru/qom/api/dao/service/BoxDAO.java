package ru.qom.api.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qom.api.dao.domain.Box;
import ru.qom.api.dao.repository.BoxRepository;

import java.util.Collection;

/**
 * Created by Тимакс on 05.09.2015.
 */
@Service("boxDAO")
public class BoxDAO {
    @Autowired
    BoxRepository boxRepository;


    public Collection<Box> findByAccountUsername(String username) {
        return boxRepository.findByAccountUsername(username);
    }
}
