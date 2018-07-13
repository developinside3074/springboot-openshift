package pe.attlaris.openshift.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class OpenShiftController {

    @GetMapping(value = "test")
    public String getMessage(){

        return "Esta en una prueba de un Proyecto SpringBoot en Openshift";
    }


}
