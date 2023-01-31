package org.launchCode.skillstracker.Controllers;


import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsControlled {

    @GetMapping("")
    @ResponseBody
    public String index() {
        return "<html lang=\"en\">" +
                "<head>" +
                "<meta charset=\"UTF-8\"> " +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "<title>Document</title>" +
                "</head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h3>We have a few skills we would like to learn. Here is the list!</h3>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("skills/form")
    public String displaySkillsForm() {
        return "<html lang=\"en\">" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                "<title>Document</title>" +
                "</head>" +
                "<body>" +
                "<form method=\"get\" action=\"skills\">" +
                "<section>" +
                "<label for=\"name\">" +
                "Name:" +
                "<input type=\"text\" name=\"name\">" +
                "</label>" +
                "</section>" +
                "<label for=\"first\">" +
                "My Favorite Language:" +
                "<select name=\"first\">" +
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>" +
                "<option value=\"python\">Python</option>" +
                "</select>" +
                "</label>" +
                "<section>" +
                "<label for=\"second\">" +
                "My Second Favorite Language:" +
                "<select name=\"second\">" +
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>" +
                "<option value=\"python\">Python</option>" +
                "</select>" +
                "</label>" +
                "</section>" +
                "<section>" +
                "<label for=\"third\">" +
                "My Third Favorite Language:" +
                "<select name=\"third\">" +
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>" +
                "<option value=\"python\">Python</option>" +
                "</select>" +
                "</label>" +
                "</section>" +
                "<input type=\"submit\" value=\"See my favorite languages!\"/>"+
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "skills/skills", method = {RequestMethod.GET, RequestMethod.POST})
    public String displaySkills(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        String html = "<html lang=\"en\">" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                "<title>Document</title>" +
                "</head>" +
                "<body>" +
                "<h1>" + name + "\'s Favorite Languages"+ "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }
}
