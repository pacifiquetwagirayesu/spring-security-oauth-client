package com.pacifique.oauthclient.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DemoController {
    private final OAuth2AuthorizedClientManager clientManager;
    @Value("${client-id}")
    private String clientId;
    @Value("${client-secret}")
    private String clientSecret;

    @GetMapping("/token")
    public Map<String,Object> token(Authentication authentication) {
        log.info("client id: {}", clientId);
        log.info("client secret: {}", clientSecret);
        OAuth2AuthorizeRequest request = OAuth2AuthorizeRequest.
                withClientRegistrationId("google")
                .principal(clientId)
                .build();
        OAuth2AuthorizedClient client = clientManager.authorize(request);

        if (client == null) {
            throw new OAuth2AuthenticationException(String.valueOf(request));
        }




        return Map.of("token", client.getAccessToken().getTokenValue(),
                "oauth",authentication
        );
    }
}
