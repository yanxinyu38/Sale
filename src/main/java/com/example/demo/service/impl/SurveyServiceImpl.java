package com.example.demo.service.impl;

import com.example.demo.entity.Survey;
import com.example.demo.mapper.SurveyMapper;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService {
    @Autowired
    private SurveyMapper surveyMapper;

    @Override
    public List<Survey> findSurvey() {
        return surveyMapper.findSurvey();
    }
}
