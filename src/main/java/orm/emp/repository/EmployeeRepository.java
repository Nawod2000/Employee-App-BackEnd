package orm.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orm.emp.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    EmployeeEntity findByFirstName(String firstName);
}
