package com.eci.cosw.springbootsecureapi.service;

import org.springframework.data.mongodb.gridfs.GridFsResource;

public interface FileService {

    GridFsResource getByName(String filename);

}
