package com.example.demoConsumerAPI.service;

import com.example.demoConsumerAPI.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;



@Service
@Component
public class DemoServiceImpl implements DemoService{

    @Value("${external.url.demo}")
    private String externalServiceUrl;

    private static final Logger LOGGER = LogManager.getLogger(DemoServiceImpl.class);

    @Autowired RestTemplate restTemplate ;

    @Override
    public List<Employee> getAllEmployee() {
        return null  ;
    }

    @Override
    public Employee getEmployeeById(Long id)  {
        ResponseEntity<Employee> response
                = restTemplate.getForEntity(externalServiceUrl + "?id=" + id, Employee.class);
        return response.getBody();
    }

    @Override
    public String saveEmployee(Employee employee) {


        return null ;
    }

    @Override
    public String updateEmployee(Employee employee) {

        return null;
    }

    @Override
    public String deleteEmployee(Long id) {
        return null ;
    }

    @Override
    public String saveAllEmployee(List<Employee> employee) {

        return null;
    }
}
