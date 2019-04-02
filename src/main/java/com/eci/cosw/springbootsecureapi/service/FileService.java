package com.eci.cosw.springbootsecureapi.service;

import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    GridFsResource getByName(String filename);

    String create(MultipartFile file) throws IOException;

}
