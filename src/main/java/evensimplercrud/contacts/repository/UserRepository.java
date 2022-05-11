package evensimplercrud.contacts.repository;

import evensimplercrud.contacts.model.UserModel;
import org.springframework.data.repository.CrudRepository;

// Link com o CRUD (funcionalidades pré-setadas pelo Spring Boot) //
public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
