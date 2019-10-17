package com.example.demo.controller;

import com.example.demo.common.web.BaseController;
import com.example.demo.entity.Survey;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ServeyController extends BaseController {
    @Autowired
    private SurveyService surveyService;
    @PostMapping("/findSurvey")
    public String findSurvey(){
        List<Survey> s= surveyService.findSurvey();
        return dealQueryResult(s,s);
    }
}
