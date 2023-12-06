package com.example.OpenGLWeb;



import org.springframework.http.ResponseEntity;  // Import ResponseEntity
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Controller
public class Triangle{
    @GetMapping("/")
    public String hw() {
        return "page";
    }

}