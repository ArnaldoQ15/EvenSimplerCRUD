package evensimplercrud.contacts.controller;

import evensimplercrud.contacts.model.UserModel;
import evensimplercrud.contacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    // Link com o repositório //
    @Autowired
    private UserRepository repository;

    // Busca do usuário a partir do ID //
    @GetMapping(path = "/user/{id}")
    public ResponseEntity query(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    // Salvar o usuário //
    @PostMapping(path = "/user/keep")
    public UserModel keep(@RequestBody UserModel user) {
        return repository.save(user);
    }

}
