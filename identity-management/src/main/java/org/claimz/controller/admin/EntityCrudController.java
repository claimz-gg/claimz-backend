package org.claimz.controller.admin;

import jakarta.ws.rs.core.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entities")
public class EntityCrudController {

    @GetMapping
    public Response listEntities() {
        return Response.ok("OK: Entities listed").build();
    }

    @PostMapping
    public Response createEntity() {
        return Response.ok("OK: Entity created").build();
    }

    @GetMapping("/{id}")
    public Response getEntity(@PathVariable Long id) {
        return Response.ok("OK: Entity with ID " + id + " retrieved").build();
    }

    @PutMapping("/{id}")
    public Response updateEntity(@PathVariable Long id) {
        return Response.ok("OK: Entity with ID " + id + " updated").build();
    }

    @DeleteMapping("/{id}")
    public Response deleteEntity(@PathVariable Long id) {
        return Response.ok("OK: Entity with ID " + id + " deleted").build();
    }
}