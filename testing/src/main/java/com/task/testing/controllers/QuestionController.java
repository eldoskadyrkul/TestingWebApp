package com.task.testing.controllers;

import com.task.testing.models.QuestionModels;
import com.task.testing.models.Questions;
import com.task.testing.service.QuestService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    QuestService service;

    @RequestMapping(value = "/testing", method = RequestMethod.POST)
    public String QuestAccess(ModelMap modelMap, HttpServletRequest servletRequest,
                              @RequestParam("textQuestion") String textQuest,
                              @RequestParam("id") int id_ques) {

        boolean isValid = Boolean.parseBoolean(null);
        if (isValid) {
            QuestionModels questionModels = new QuestionModels(id_ques, textQuest);
            Questions questions = service.getQuestionFromDatabase(questionModels);
        }

        return servletRequest.getPathInfo();
    }

    @RequestMapping(value = "/user/testing", method = RequestMethod.GET)
    public String question(ModelMap modelMap) {
        List<ModelMap> questionsList = new ArrayList<>();
        questionsList.add(modelMap.addAttribute("id_quest", new QuestionModels().getId_quest()));
        questionsList.add(modelMap.addAttribute("text_question", new QuestionModels().getName()));
        return "user/testing";
    }
}
