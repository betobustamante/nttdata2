package com.nttdata.pt2.controller;

import com.nttdata.pt2.dto.FactorialResponse;
import com.nttdata.pt2.dto.GreetingResponse;
import com.nttdata.pt2.exception.RequestException;
import com.nttdata.pt2.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/")
public class restController {

    private static final String TEAMS = "NTTDATA";

    @GetMapping("/hola")
    @ResponseBody
    public GreetingResponse getGreeting(){
        GreetingResponse greetingResponse  = new GreetingResponse();
        greetingResponse.setGreeting("Hola " + TEAMS + " excelente inicio de semana");
        return greetingResponse;
    }

    @GetMapping("/factorial/{numero}")
    //@ResponseBody
    public FactorialResponse getFactorial(@PathVariable (required = false) Integer numero){
        FactorialResponse factorialResponse  = new FactorialResponse();
        Service service = new Service();
        if(numero != null && numero >= 0 && numero <= 49) {
            long factorial = Service.calcularFactorial(numero);
            factorialResponse.setResult(factorial);
        }else {
            throw new RequestException("E-103", HttpStatus.BAD_REQUEST,"Parámetro no valido para esta operación");
        }

        return factorialResponse;
    }


}
