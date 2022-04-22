package casestudy.Adminservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

@Autowired
private AdminRepository adminrepo;

@PostMapping("/addAdmin")
public Admin addAdmin(@RequestBody Admin admin)
{
	return adminrepo.save(admin);
}

}
