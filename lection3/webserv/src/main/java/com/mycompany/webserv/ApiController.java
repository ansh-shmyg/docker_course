package com.mycompany.webserv;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ApiController {
    public static final String template = "Hello %s!";
    public final AtomicLong counter = new AtomicLong();
    @RequestMapping(method = RequestMethod.GET, path = "/api")
    Api api(@RequestParam(defaultValue = "to Docker course") String name, HttpServletRequest request){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTime = formatter.format(new Date());
        String userAgent = request.getHeader("User-Agent");
        String userIpAdrress = request.getRemoteAddr();
        String uuid = UUID.randomUUID().toString();
        return new Api(counter.incrementAndGet(), String.format(template, name), currentTime, uuid, userAgent, userIpAdrress);
    }
}
