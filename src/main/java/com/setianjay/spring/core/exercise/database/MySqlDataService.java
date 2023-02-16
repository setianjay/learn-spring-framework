package com.setianjay.spring.core.exercise.database;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{6, 7, 8, 9, 10};
    }
}
