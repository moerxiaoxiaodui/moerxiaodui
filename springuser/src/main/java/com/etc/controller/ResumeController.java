package com.etc.controller;

import com.etc.entity.Resume;
import com.etc.service.ResumeService;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Controller
public class ResumeController {

    @Resource
    private ResumeService resumeService;

    @RequestMapping("/myresume")
    public ModelAndView resume() {
        ModelAndView mv = new ModelAndView("profile");
        return mv;
    }

    @RequestMapping("/saveresume")
    public ModelAndView saveresume(HttpServletRequest request, @RequestParam("file") MultipartFile file,Resume resume) throws IOException {
        if (!file.isEmpty()) { //如果文件不为空，写入上传路径
            String p = request.getSession().getServletContext().getRealPath("/headpicture"); //上传文件路径
            String path=("D://headpicture/");
            //文件原始名字
            String filename = file.getOriginalFilename();
            String suffixLast = filename.substring(filename.lastIndexOf("."));  //获取文件后缀
            String newFileName = UUID.randomUUID() + suffixLast;     //文件新名字
            File filepath = new File(path, newFileName);
            /*判断路径是否存在，如果不存在就创建一个*/
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path + File.separator + newFileName));
            String imageUrl = "D://headpicture/" + newFileName;
            request.getSession().setAttribute("imageUploadUrl", imageUrl);
            boolean b = true;
        }
        else{
           ModelAndView mv=new ModelAndView("profile");
           mv.addObject("message","未选择图片");
           return mv;
        }
        System.out.println(file);
        System.out.println(resume);
        ModelAndView mv = new ModelAndView("profile");
        resume.setUserId("1");
        resumeService.saveUserResume(resume);
        mv.addObject("resume", resume);
        mv.addObject("message","上传成功");
        return mv;
    }
}