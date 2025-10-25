package com.pacifique.oauthclient.config;

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
