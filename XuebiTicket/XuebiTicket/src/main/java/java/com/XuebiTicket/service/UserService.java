import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
	
	public UserService() {
		super();
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}    
	
	public Iterable<User> listUsers() {
		return userRepository.findAll();
	}
	
	public User getUserById(long id) {  
		System.err.println("Cache Miss!");
		return userRepository.findOne(id);  
	}
		
	public User updateUser(User user) {   
		return userRepository.save(user);   
	}    
	
	public void deleteUserById(long id) {   
		userRepository.delete(id);   
	}    
	
	public User getUserByUsername(String username) {   
		return userRepository.findByUsername(username);  
	}
	
}
