package com.mark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload(MultipartFile uploadFile) throws IOException {
        System.out.println("upload!");
        //文件存储 把上传上来的文件存储下来
        uploadFile.transferTo(new File("3.txt"));
        return "/WEB-INF/page/test.jsp";
    }
}
