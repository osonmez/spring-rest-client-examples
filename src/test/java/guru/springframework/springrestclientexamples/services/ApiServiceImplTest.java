package guru.springframework.springrestclientexamples.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.api.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

	@Autowired
	ApiService apiService;
	
	@Test
	public void testGetUsers() {
		List<User> users = apiService.getUsers(3);
		assertEquals(1, users.size());
	}
}
