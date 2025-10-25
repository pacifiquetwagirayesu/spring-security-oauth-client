package com.pacifique.oauthclient.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Map;

//@Controller
//@Slf4j
public class HomeController {

//    @GetMapping("/")
    public String home(OAuth2AuthenticationToken authenticationToken) {
        OAuth2User principal = authenticationToken.getPrincipal();
        Map<String, Object> attributes = principal.getAttributes();
        //CommonOAuth2Provider
        return "index.html";
    }
}
