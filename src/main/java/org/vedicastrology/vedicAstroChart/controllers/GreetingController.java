package org.vedicastrology.vedicAstroChart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.vedicastrology.vedicAstroChart.models.Greeting;

/**
 * Created by swoven on 3/14/19.
 * Just for testing purpose
 */
@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";

    @GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(String.format(template, name));
    }
}
