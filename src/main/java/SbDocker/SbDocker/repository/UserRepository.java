package SbDocker.SbDocker.repository;

import SbDocker.SbDocker.modelEntity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
