package org.claimz.controller.admin;

import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class AdminUserManagementController {

    @GetMapping("/admin")
    public Response listUsers() {
        return Response.ok("OK: All users listed").build();
    }

    @PutMapping("/admin/{id}/enable")
    public Response enableUser(@PathVariable Long id) {
        return Response.ok("OK: User with ID " + id + " enabled").build();
    }

    @PutMapping("/admin/{id}/disable")
    public Response disableUser(@PathVariable Long id) {
        return Response.ok("OK: User with ID " + id + " disabled").build();
    }
}