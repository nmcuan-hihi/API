package com.employee.employee.service;

import com.employee.employee.model.Position;
import com.employee.employee.repostory.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServicelmpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }
    @Override
    public Position addPosition(Position position) {
        return positionRepository.save(position);
    }
}
