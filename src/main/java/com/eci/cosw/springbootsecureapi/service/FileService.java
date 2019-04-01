package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.File;
import org.springframework.data.mongodb.gridfs.GridFsResource;

public interface FileService {

    GridFsResource getByName(String filename);

    void create(File file);

}
