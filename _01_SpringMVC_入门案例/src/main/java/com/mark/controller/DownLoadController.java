package com.mark.controller;

import com.mark.Utils.DownLoadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DownLoadController {

    @RequestMapping("/downloadFile")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response) throws Exception {
        DownLoadUtils.downloadFile("/WEB-INF/file/马文磊json.txt",request.getServletContext(),response);
        //注意：文件下载是一个提交请求，所以不能用作网页跳转
        //return "/WEB-INF/page/test.jsp";
    }
}
