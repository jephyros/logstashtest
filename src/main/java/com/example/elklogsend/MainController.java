package com.example.elklogsend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author InSeok
 * Date : 2020-10-21
 * Remark :
 */
@Controller
@Slf4j
public class MainController {

    @RequestMapping("/")
    public String index(){
        log.warn("log elk send -----------test 한글 도 잘가는건가?");
        return "index";

    }
}
