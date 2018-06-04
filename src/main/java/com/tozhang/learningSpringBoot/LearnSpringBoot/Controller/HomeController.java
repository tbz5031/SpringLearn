package com.tozhang.learningSpringBoot.LearnSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController   //The @RestController annotation indicates that we
// don't want to render views, but write the results straight into the response body instead.
public class HomeController {
    @GetMapping   //@GetMapping is Spring's shorthand annotation for @RequestMapping(method = RequestMethod.GET).
    // In this case, it defaults the route to /
    public String greeting(@RequestParam(required = false,
            defaultValue = "") String name) {
        //Our greeting() method has one argument--@RequestParam(required=false, defaultValue="") String name.
        // It indicates that this value can be requested via an HTTP query (?name=Greg)--the query isn't required,
        // and in case it's missing, it will supply an empty string.
        //test for fun
        return name.equals("") ? "Hey!" : "Hey, " + name + "!";
    }
}
