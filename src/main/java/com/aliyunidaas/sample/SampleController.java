package com.aliyunidaas.sample;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/oidc-principal")
    public OAuth2User getOidcUserPrincipal(@AuthenticationPrincipal OAuth2User principal) {
        return principal;
    }

    @GetMapping("/oidc-principal2")
    public Object getOidcUserPrincipal2() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof OidcUser) {
            OidcUser principal = ((OidcUser) authentication.getPrincipal());
            return principal;
        } else {
            return authentication.getPrincipal();
        }
    }

    @GetMapping("/sensitive_resource")
    public String getSensitiveResource() {
        return "success";
    }
}
