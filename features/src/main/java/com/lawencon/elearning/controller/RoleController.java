package com.lawencon.elearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lawencon.elearning.model.Role;
import com.lawencon.elearning.service.RoleService;
import com.lawencon.elearning.util.WebResponseUtils;

/**
 * 
 * @author WILLIAM
 *
 */

@RestController
@RequestMapping("/role")
public class RoleController {

  @Autowired
  private RoleService roleService;

  @GetMapping("/getall")
  public ResponseEntity<?> getAll() throws Exception {
    return WebResponseUtils.createWebResponse(roleService.findAll(), HttpStatus.OK);
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<?> getById(@PathVariable("id") String id) throws Exception {
    return WebResponseUtils.createWebResponse(roleService.findById(id), HttpStatus.OK);
  }

  @GetMapping("code/{code}")
  public ResponseEntity<?> getByCode(@PathVariable("code") String code) throws Exception {
    return WebResponseUtils.createWebResponse(roleService.findByCode(code), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<?> insertRole(@RequestBody Role body) throws Exception {
    roleService.create(body);
    return WebResponseUtils.createWebResponse("Insert Success", HttpStatus.OK);
  }

}
