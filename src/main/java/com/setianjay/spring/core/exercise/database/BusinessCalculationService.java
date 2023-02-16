package com.setianjay.spring.core.exercise.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
    private final DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }

    public int findMax(){
        int[] data = dataService.retrieveData();
        int max = data[0];

        for(int element: data){
            if(element > max){
                max = element;
            }
        }

        return max;
    }
}
