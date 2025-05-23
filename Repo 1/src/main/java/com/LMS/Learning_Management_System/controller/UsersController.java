package com.lms.learningmanagementsystem.controller;

import com.lms.learningmanagementsystem.service.UsersTypeService;
import com.lms.learningmanagementsystem.model.UsersType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersTypeService usersTypeService;

    @Autowired
    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }

    @GetMapping("/types")
    public ResponseEntity<List<UsersType>> getAllUserTypes() {
        List<UsersType> usersTypes = usersTypeService.getAll();
        return ResponseEntity.ok(usersTypes);
    }
}
