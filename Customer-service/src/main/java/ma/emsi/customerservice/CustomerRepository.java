package ma.emsi.customerservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("*")
@RepositoryRestResource
interface CustomerRepository extends JpaRepository<Customer,Long> { }