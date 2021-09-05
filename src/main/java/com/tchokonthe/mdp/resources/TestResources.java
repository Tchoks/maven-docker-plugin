package com.tchokonthe.mdp.resources;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author martin
 * @created on 20/08/2021 at 00:14
 * @project com.tchokonthe.mdp.resources
 * @email (martin.aurele12 @ gmail.com)
 */


@RestController
public class TestResources {


    @GetMapping("/hello")
    public String hello() {
        return "Hello maven docker plugin";
    }
}
