package org.claimz.controller;

import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    @PostMapping("/mfa/setup")
    public Response setupMfa() {
        return Response.ok("OK: MFA setup initiated").build();
    }

    @PostMapping("/mfa/verify")
    public Response verifyMfa() {
        return Response.ok("OK: MFA verified").build();
    }
}