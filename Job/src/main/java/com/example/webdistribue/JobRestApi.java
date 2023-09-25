package com.example.webdistribue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestApi {
    @Autowired
    private JobService jobService;
    @GetMapping("/getById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Job getById(@PathVariable(value = "id") Integer id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/getByservice/{service}")
    @ResponseStatus(HttpStatus.OK)
    public List<Job> getById(@PathVariable(value = "service") String service) {
        return jobService.getByService(service);
    }
    @GetMapping("/updateEtat/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Job updateEtat(@PathVariable(value = "id") Integer id) {
        return jobService.updateCandidat(id);
    }

}
