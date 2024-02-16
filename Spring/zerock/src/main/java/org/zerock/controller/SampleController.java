package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
    @RequestMapping(value = "")
    public void basic() {
        System.out.println("basic......");
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
    public void basicGet() {
        System.out.println("basic get......");
    }

    @RequestMapping(value = "/basicOnlyGet", method = {RequestMethod.GET})
    public void basicGet2() {
        System.out.println("basic get only get......");
    }
    @RequestMapping(value = "/basicOnlyPost", method = {RequestMethod.POST})
    public void basicPost() {
        System.out.println("basic post only......");
    }
}
