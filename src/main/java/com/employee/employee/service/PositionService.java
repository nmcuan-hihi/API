package com.employee.employee.service;

import com.employee.employee.model.Position;

import java.util.List;

public interface PositionService {

    public List<Position> getAllPositions();

    Position addPosition(Position position);


}
