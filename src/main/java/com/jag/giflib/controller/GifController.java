package com.jag.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String listGifs(){

        return "List of all the Gif's !!";
    }


    @RequestMapping(value = "/gifs")
    @ResponseBody
    public String listMyGifs(){

        return "List of all MY Gif's !!";
    }

}
