package com.pacifique.ssiach16ex1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

//@Configuration
public class SecurityConfig {
//
//    @Value("${client-id}")
//    private String clientId;
//    @Value("${client-secret}")
//    private String clientSecret;
//
//    @Value("${github-client-id}")
//    private String getClientId;
//    @Value("${github-client-secret}")
//    private String getClientSecret;
//
//    @Bean
//    public SecurityFilterChain configSecurity(HttpSecurity http) throws Exception {
//        http.oauth2Login(Customizer.withDefaults());
//        http.authorizeHttpRequests(auth -> auth
//                .anyRequest().authenticated());
//        return http.build();
//    }
//
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        return new InMemoryClientRegistrationRepository(this.clientsRegistration());
//    }
//
//    private List<ClientRegistration> clientsRegistration() {
//        ClientRegistration google = CommonOAuth2Provider.GOOGLE.getBuilder("google")
//                .clientId(clientId)
//                .clientSecret(clientSecret)
//                .build();
//        ClientRegistration github = CommonOAuth2Provider.GITHUB.
//                getBuilder("github").clientId(getClientId).clientSecret(getClientSecret).build();
//
//        ClientRegistration custom = ClientRegistration.withRegistrationId("1")
//                .clientId("client")
//                .clientSecret("secret")
//                .clientName("Custom")
//                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//                .redirectUri("http://localhost:8080/login/oauth2/code/my_authorization_server")
//                .issuerUri("http://127.0.0.1:7070")
//                .authorizationUri("http://127.0.0.1:7070/oauth2/authorize")
//                .tokenUri("http://127.0.0.1:7070/oauth2/token")
//                .scope(OidcScopes.OPENID).build();
//
//        return List.of(google, github,custom);
//    }
}
