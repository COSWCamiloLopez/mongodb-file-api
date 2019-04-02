package com.eci.cosw.springbootsecureapi.service;

import com.mongodb.client.gridfs.model.GridFSFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    GridFsTemplate gridFsTemplate;

    @Override
    public GridFsResource getByName(String filename) {
        GridFSFile file = gridFsTemplate.findOne(new Query().addCriteria(Criteria.where("filename").is(filename)));

        GridFsResource resource = gridFsTemplate.getResource(file.getFilename());

        return resource;
    }

    @Override
    public String create(MultipartFile file) throws IOException {
        gridFsTemplate.store(file.getInputStream(), file.getOriginalFilename(), file.getContentType());
        return ("localhost:8080/file/name/" + file.getOriginalFilename());
    }
}
