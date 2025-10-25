package com.pacifique.ssiach16ex1.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
public class ProjectConfig {

    @Value("${client-id}")
    private String clientId;
    @Value("${client-secret}")
    private String clientSecret;



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.oauth2Client(Customizer.withDefaults());
        http.authorizeHttpRequests(a->a.anyRequest().permitAll());
        return http.build();
    }

    @Bean
    public OAuth2AuthorizedClientManager auth2AuthorizedClientManager(
            ClientRegistrationRepository clientRegistrationRepository,
            OAuth2AuthorizedClientRepository authorizedClientRepository
    ){

        var provider = OAuth2AuthorizedClientProviderBuilder.builder()
                .authorizationCode()
                .refreshToken()
//                .clientCredentials()
                .build();

        var clientManager = new DefaultOAuth2AuthorizedClientManager(
                clientRegistrationRepository,
                authorizedClientRepository);
        clientManager.setAuthorizedClientProvider(provider);
        return clientManager;

    }

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
//        ClientRegistration c1 =
//                ClientRegistration.withRegistrationId("1")
//                        .clientId("client")
//                        .clientSecret("secret")
//                        .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
//                        .clientAuthenticationMethod(
//                                ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//                        .tokenUri("http://localhost:7070/oauth2/token")
//                        .scope(OidcScopes.OPENID)
//                        .build();
        ClientRegistration c1 = CommonOAuth2Provider.GOOGLE.getBuilder("google")
                .clientId(clientId)
                .clientSecret(clientSecret)
                .redirectUri("http://localhost:8080/login/oauth2/code/google")
                .build();

        return new InMemoryClientRegistrationRepository(c1);
    }
}
