package cavm.prototipo.agricultura.user.controller;

import cavm.prototipo.agricultura.user.model.dto.User;
import cavm.prototipo.agricultura.user.model.request.UserRequest;
import cavm.prototipo.agricultura.user.service.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(iUserService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{documentNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getByDocumentNumber(@PathVariable String documentNumber) {
        User user = iUserService.getByDocumentNumber(documentNumber);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody UserRequest request) {
        User user = User.builder()
                .documentNumber(request.getDocumentNumber())
                .name(request.getName())
                .lastname(request.getLastname())
                .username(request.getUsername())
                .email(request.getEmail())
                .phone(request.getPhone())
                .birth(request.getBirth())
                .isFarmer(request.isFarmer())
                .registerDate(new Date())
                .state(true)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(iUserService.create(user));
    }
}
