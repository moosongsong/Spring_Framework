package com.example.fileUploadTest;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UploadController {
	@Autowired
	@Qualifier("uploadPath")
	String uploadPath;

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String upload() {
		return "form";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void upload(@RequestParam("upfile") MultipartFile[] files, HttpServletResponse response) throws IOException {
//		System.out.println("업로드 파일명 : " + file.getOriginalFilename());
//		System.out.println("업로드 파일 유형 : "+file.getContentType());
//		System.out.println("업로드 파일 크기 : "+file.getSize());
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		StringBuffer sb = new StringBuffer();
		for (MultipartFile file : files){
			File saveFile = new File(uploadPath, file.getOriginalFilename());
			FileCopyUtils.copy(file.getBytes(),saveFile);
			sb.append(file.getOriginalFilename()+"\n");
		}

		out.println(sb.toString());
	}
}
