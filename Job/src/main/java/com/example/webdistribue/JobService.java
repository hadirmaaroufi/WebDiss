package com.example.webdistribue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }
    public List<Job> getByService(String service){
        return jobRepository.findByService(service);
    }
    public Job getJobById(Integer id){
        return jobRepository.findById(id).orElse(new Job());
    }
    public Job updateCandidat(int id) {
        if (jobRepository.findById(id).isPresent()) {
            Job existingCandidat = jobRepository.findById(id).get();
            existingCandidat.setEtat(!existingCandidat.getEtat());
            return jobRepository.save(existingCandidat);
        } else
            return null;
    }


}
