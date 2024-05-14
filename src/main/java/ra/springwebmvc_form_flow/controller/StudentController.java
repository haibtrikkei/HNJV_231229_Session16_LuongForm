package ra.springwebmvc_form_flow.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.springwebmvc_form_flow.entity.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentController {
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sf,true));
    }

    @RequestMapping(value = {"/","/initInsertStudent"})
    public String initInsertStudent(Model model){
        Student s = new Student();
        model.addAttribute("s",s);
        return "addStudent";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@ModelAttribute("s")Student stu, Model model){
        model.addAttribute("s",stu);
        return "viewStudent";
    }
}
