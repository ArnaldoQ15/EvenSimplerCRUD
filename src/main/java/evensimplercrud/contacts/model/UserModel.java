package evensimplercrud.contacts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "contact")
public class UserModel {

    // Coluna 1 - ID (PK) do usuário
    @Id
    public Integer id;

    // Coluna 2 - nome do usuário
    @Column(nullable = false, length = 255)
    public String name;

    // Coluna 3 - e-mail do usuário
    @Column(nullable = false, length = 255)
    public String email;

    // Coluna 4 - telefone do usuário
    @Column(nullable = false, length = 45)
    public String phone;

    // Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
