package com.etc.controller;

import com.etc.entity.Message;
import com.etc.entity.Recruit;
import com.etc.entity.Resume;
import com.etc.entity.User;
import com.etc.service.MessageService;
import com.etc.service.RecruitService;
import com.etc.service.ResumeService;
import com.etc.service.UserService;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    @Resource
    private UserService userService;
    @Resource
    private MessageService messageService;
    @Resource
    private RecruitService recruitService;


    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        List<Recruit> list = recruitService.findRecruitByKey("");
        mv.addObject("list",list);
        return mv;
    }

    @RequestMapping("message/{userId}")
    public ModelAndView message(@PathVariable Integer userId){
        User u=userService.findOneUserbyid(userId);
        System.out.println(u);

        ModelAndView mv = new ModelAndView("returnNotice");
        if (u!=null) {
            List<Message> list = messageService.findAllByToId(userId);
            mv.addObject("user",u);
            mv.addObject("list",list);
        }
        else {
            mv.setViewName("index");
        }
        return mv;
    }
    @RequestMapping("/logout")
    public String logout(){
        return "signin";
    }



    @RequestMapping("/myresume/{userId}")
    public ModelAndView resume(@PathVariable Integer userId) {
        ModelAndView mv = new ModelAndView("profile");
        Resume resume=resumeService.findByUserId(userId);
        mv.addObject("resume",resume);
        System.out.println(resume);
        System.out.println(resume.getAvatar());
        return mv;
    }




    @RequestMapping("/saveresume")
    public ModelAndView saveresume(HttpServletRequest request, @RequestParam("file") MultipartFile file,Resume resume) throws IOException {
        System.out.println(resume);
        if (!file.isEmpty()) { //如果文件不为空，写入上传路径
            String p= request.getSession().getServletContext().getRealPath("/images/upload"); //上传文件路径
            String path = new String("springuser/src/main/resources/static/headpicture/");
            //文件原始名字
            String filename = file.getOriginalFilename();
            String suffixLast = filename.substring(filename.lastIndexOf("."));  //获取文件后缀
            String newFileName = UUID.randomUUID().toString() + suffixLast;     //文件新名字
            File filepath = new File(path, newFileName);
            /*判断路径是否存在，如果不存在就创建一个*/
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            System.out.println(filepath.getAbsolutePath());
            file.transferTo(new File(filepath.getAbsolutePath()));
            String imageUrl ="/headpicture/"+ newFileName;
            System.out.println(imageUrl);
            resume.setAvatar(imageUrl);
            ModelAndView mv = new ModelAndView("forward:/myresume/"+resume.getUserId());
            System.out.println(resume);
            resumeService.saveUserResume(resume);
            mv.addObject("resume", resume);
            HttpSession session=request.getSession();
            session.setAttribute("resume",resume);
            return mv;
        }
        else{
            ModelAndView mv = new ModelAndView("redirect:/myresume/"+resume.getUserId());
            System.out.println(resume);
            resumeService.saveUserResume(resume);
            mv.addObject("resume", resume);
            return mv;
        }
    }
}