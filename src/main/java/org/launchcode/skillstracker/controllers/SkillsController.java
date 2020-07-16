package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String home(){
        return
            "<html>" +
                "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>List of Languages</h2>" +
                    "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                    "</ol>" +
                "</body>" +
            "</html>";
    }

    @GetMapping("form")
    public String form(){
        return
            "<html>" +
                "<body>" +
                    "<form action='form-filled' method='post'>" +
                        "<input type='input' name='name' placeholder='Please enter your name' autofocus>" +
                        "<hr>" +
                        "<div>" +
                            "<label for='first'>My favorite language</label>" +
                            "<div>" +
                                "<select name='first'>" +
                                    "<option value=''>Please choose</option>" +
                                    "<option value='Java'>Java</option>\n" +
                                    "<option value='JavaScript'>JavaScript</option>\n" +
                                    "<option value='Python'>Python</option>\n" +
                                "</select>" +
                            "</div>" +
                        "</div>" +
                        "<hr>" +
                        "<div>" +
                            "<label for='first'>My second favorite language</label>" +
                            "<div>" +
                                "<select name='second'>" +
                                    "<option value=''>Please choose</option>" +
                                    "<option value='Java'>Java</option>\n" +
                                    "<option value='JavaScript'>JavaScript</option>\n" +
                                    "<option value='Python'>Python</option>\n" +
                                "</select>" +
                            "</div>" +
                        "</div>" +
                        "<hr>" +
                        "<div>" +
                            "<label for='first'>My third favorite language</label>" +
                            "<div>" +
                                "<select name='third'>" +
                                    "<option value=''>Please choose</option>" +
                                    "<option value='Java'>Java</option>\n" +
                                    "<option value='JavaScript'>JavaScript</option>\n" +
                                    "<option value='Python'>Python</option>\n" +
                                "</select>" +
                            "</div>" +
                        "</div>" +
                        "<hr>" +
                        "<input type='submit' value='SUBMIT'>" +
                    "</form>" +
                "</body>" +
            "</html>";
    }

    @PostMapping("form-filled")
    public String formSubmit(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third){
        return
            "<html>" +
                "<body>" +
                    "<h1>" + name + "</h1>" +
                    "<ol>" +
                        "<li>" + first + "</li>" +
                        "<li>" + second + "</li>" +
                        "<li>" + third + "</li>" +
                    "</ol>" +
                "</body>" +
            "</html>";
    }

}
