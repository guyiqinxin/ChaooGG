package com.yuwenchao.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileuploadController {

	/**
	 * 文件上传功能
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody ModelAndView upload(@RequestParam("file") MultipartFile file, HttpServletRequest request)
			throws IOException {
		ModelAndView mv = new ModelAndView("success");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		String res = sdf.format(new Date());

// uploads文件夹位置
		String rootPath = request.getSession().getServletContext().getRealPath("WEB-INF/upload");
// 原始名称
		String originalFileName = file.getOriginalFilename();
		
		if(originalFileName.isEmpty()) {
			request.setAttribute("error", "你没有选择要上传的文件,请选择文件后重新上传！");
			return mv;
		}
// 新文件名
		String newFileName = "newFile" + res + originalFileName.substring(originalFileName.lastIndexOf("."));
// 创建年月文件夹
		Calendar date = Calendar.getInstance();
		File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1));

// 新文件
		File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);
// 判断目标文件所在目录是否存在
		if (!newFile.getParentFile().exists()) {
// 如果目标文件所在的目录不存在，则创建父目录
			newFile.getParentFile().mkdirs();
		}
		
		request.setAttribute("newFile", newFile);
		System.out.println("打印上传消息：" + newFile);
		
// 将内存中的数据写入磁盘
		file.transferTo(newFile);
// 完整的url

		String fileUrl = date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + newFileName;

		System.out.println("打印上传消息：" + fileUrl);
		mv.addObject("path", fileUrl);
		return mv;
	}

	/**
	 * 文件下载功能
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/down")
	public void down(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 模拟文件，myfile.txt为需要下载的文件
		String fileName = request.getSession().getServletContext().getRealPath("WEB-INF/upload") + "/abcde.txt";
		// 获取输入流
		InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
		// 假如以中文名下载的话
		String filename = "下载文件.txt";
		// 转码，免得文件名中文乱码
		filename = URLEncoder.encode(filename, "UTF-8");
		// 设置文件下载头
		response.addHeader("Content-Disposition", "attachment;filename=" + filename);
		// 1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
		response.setContentType("multipart/form-data");
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		int len = 0;
		while ((len = bis.read()) != -1) {
			out.write(len);
			out.flush();
		}
		out.close();
	}

}
