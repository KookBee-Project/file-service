package com.KookBee.fileservice.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class FileRequest {
    private MultipartFile file;
}
