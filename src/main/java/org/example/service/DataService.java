package org.example.service;

import org.example.entity.User;

public interface DataService {
    void create(User user);
    User read(Integer Id);
}
