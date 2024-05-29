package com.employee.employee.controller;

import com.employee.employee.model.Position;
import com.employee.employee.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions")
@CrossOrigin
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/getAllPosition")
    public List<Position> getAllPositions() {
        return positionService.getAllPositions();
    }

    @PostMapping("/addPosition")
    public Position createPosition(@RequestBody Position position) {
        return positionService.addPosition(position);
    }
}
