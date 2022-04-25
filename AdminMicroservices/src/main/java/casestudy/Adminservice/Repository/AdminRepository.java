package casestudy.Adminservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import casestudy.Adminservice.model.Admin;


public interface AdminRepository extends MongoRepository<Admin, String>{
	

}
