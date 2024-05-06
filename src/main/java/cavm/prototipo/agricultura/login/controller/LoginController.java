package cavm.prototipo.agricultura.login.controller;

import cavm.prototipo.agricultura.login.service.ILoginService;
import cavm.prototipo.agricultura.producto.model.dto.Producto;
import cavm.prototipo.agricultura.producto.model.request.ProductoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    private final ILoginService iLoginService;

    public LoginController(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }
}
