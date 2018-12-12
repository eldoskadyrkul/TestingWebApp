package com.task.testing.controllers;

import com.task.testing.models.SubjectModels;
import com.task.testing.models.Subjects;
import com.task.testing.service.SubjectService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/subjects", method = RequestMethod.POST)
    private String SubjectAccess(HttpServletRequest request,
                                 @RequestParam("name") String name_subject) {
        SubjectModels subjectModels = new SubjectModels(name_subject);
        Subjects subjects = subjectService.getSubjectsFromDB(subjectModels);
        return request.getPathInfo();
    }

    @RequestMapping(value = "/subject", method = RequestMethod.GET)
    public String ViewSubject(ModelMap modelMap) {
        modelMap.addAttribute("subjects", new SubjectModels().getName_subj());
        return "subjects";
    }
}
