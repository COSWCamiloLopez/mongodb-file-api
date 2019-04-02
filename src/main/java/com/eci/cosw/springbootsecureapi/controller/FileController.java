package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("file")
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("name/{filename}")
    @ResponseBody
    public ResponseEntity<?> getByName(@PathVariable("filename") String filename) {
        try {

            GridFsResource resource = fileService.getByName(filename);

            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(resource.getContentType()))
                    .body(new InputStreamResource(resource.getInputStream()));

        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("new")
    @ResponseBody
    public String create(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) throws IOException {
        return fileService.create(file);
    }

}
