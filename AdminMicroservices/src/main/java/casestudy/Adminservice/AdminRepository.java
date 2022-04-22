package casestudy.Adminservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String>{
	

}
