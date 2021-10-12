import com.example.securingweb.SecuringWebApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest(classes = SecuringWebApplication.class)
public class SpringSecurityTest {
    @Test
    void testPasswordEncoder(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123456");
        System.out.println(encoder.matches("123456",encode));
    }
}
