package pl.hil4rion.movielibrary.domain.loginandregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginAndRegisterConfiguration {

    @Bean
    public LoginAndRegisterFacade loginAndRegisterFacade(UserRepository userRepository) {
        return new LoginAndRegisterFacade(userRepository);
    }
}
