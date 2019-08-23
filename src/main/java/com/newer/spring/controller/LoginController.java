package com.newer.spring.controller;

import com.newer.spring.util.SecurityCode;
import com.newer.spring.util.SecurityImage;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class LoginController {


    @RequestMapping("sCode")
    public void sCode(HttpServletRequest request, HttpServletResponse response) throws IOException {

//1生成验证码
        String st = SecurityCode.getSecurityCode();
        //验证码存入session中方便登陆时验证验证码是否正确
        HttpSession session = request.getSession();
        session.setAttribute("st", st);
        //2根据验证码生成图片
        BufferedImage bufimg = SecurityImage.getImage(st);
        //设置响应头部不缓存
        response.setHeader("pragma","No-chache");
        response.setHeader("Cache-Control","No-chache");
        //设置响应内容的格式
        response.setContentType("image/jpeg");
        //设置过期时间
        response.setDateHeader("Expirs", 0);
        //将图片写入到响应输出流中输出
        ImageIO.write(bufimg, "JPEG", response.getOutputStream());

    }


//    public RequestEntity<?> login(HttpSession session,String aname,String pwd){
//
//        return  new RequestEntity<>
//    }
//    @GetMapping("usersession")
//    public RequestEntity<?> usersession(HttpSession session){
//
//    }
}
