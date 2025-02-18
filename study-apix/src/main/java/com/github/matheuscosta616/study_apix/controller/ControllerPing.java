package com.github.matheuscosta616.study_apix.controller;

import com.github.matheuscosta616.study_apix.dto.Caicola;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/ping")
public class ControllerPing {
    @GetMapping
    public String caicolaFala(){

        return "caique deu um gemidinho aiinn";
    }

    @PostMapping
    public Caicola caicola(@RequestBody Caicola caicola){
        return caicola;
    }
}
