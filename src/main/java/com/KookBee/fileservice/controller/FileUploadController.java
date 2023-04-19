package com.KookBee.fileservice.controller;


import com.KookBee.fileservice.request.FileRequest;
import com.KookBee.fileservice.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/upload")
@RequiredArgsConstructor
public class FileUploadController {
    private final FileUploadService uploadService;
    @PostMapping("")
    public ResponseEntity<String> updateMemberInfo(FileRequest request) throws IOException {

        String uuid = uploadService.uploadFile(request);

        return new ResponseEntity<>(uuid, HttpStatus.OK);
    }
}
