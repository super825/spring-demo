package com.ada.springmvc.helloworld;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ada.annotation.beans.Department;
import com.ada.annotation.beans.Employee;

@Controller
public class HelloWorld {

    public HelloWorld() {
        System.out.println("======HelloWorldHandler被初始化了");
    }

    @RequestMapping(value = "/hello")
    public String testHelloWorld() {
        System.out.println("Hello SpingMVC!");
        return "success";
    }

    @RequestMapping({ "/testValue", "/testValue2" })
    public String testValue() {
        System.out.println("testValue");
        return "success";
    }

    @RequestMapping(value = "/testMethodGet", method = RequestMethod.GET)
    public String testMethod() {
        System.out.println("testMethodGet");
        return "success";
    }

    @RequestMapping(value = "/testMethodPost", method = RequestMethod.POST)
    public String testMethod2() {
        System.out.println("testMethodPost");
        return "success";
    }

    @RequestMapping(value = "/testRequestParam", method = RequestMethod.GET)
    public String testRequestParam(@RequestParam(value = "username") String username,
                    @RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {
        System.out.println(username);
        System.out.println(age);
        return "success";
    }

    @RequestMapping(value = "/testPOJO", method = RequestMethod.POST)
    public String testPOJO(Employee employee) {
        System.out.println(employee);
        return "success";
    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("testServletAPI");
        String username = req.getParameter("username");
        req.setAttribute("username", username);
        req.getSession().setAttribute("username", username);
        return "user";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(HttpSession session) {
        System.out.println("testModelAndView");
        ModelAndView mav = new ModelAndView();
        Department dept = new Department(1, "软件部");
        Employee employee = new Employee(1, "jack", "jack@ada.com", dept);
        mav.addObject("emp", employee);// 实现上最终调用的是req.setAttribute("emp", employee);
        session.setAttribute("emp", employee);
        mav.setViewName("model");
        return mav;
    }

    @RequestMapping("/testMap")
    public String testMap(HttpSession session, Map<String, Object> map) {
        System.out.println("testMap");
        Department dept = new Department(1, "软件部");
        Employee employee = new Employee(1, "jack", "jack@ada.com", dept);
        map.put("emp", employee);// 实现上最终调用的是req.setAttribute("emp", employee);
        session.setAttribute("emp", employee);
        return "model";
    }

    // @ResponseBody注解后直接返回字符串"success"，而不是对应的jsp
    @ResponseBody
    @RequestMapping("/testResponseBody")
    public String testResponseBody() {
        System.out.println("testResponseBody");
        return "success";
    }

    // Redirect方法调用者与被调用者使用各自的request对象和response对象，它们属于两个独立的访问请求和响应过程
    // 地址栏明显变化
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect");
        return "redirect:redirect.jsp";
    }

    // forward方法的调用者与被调用者之间共享相同的request对象和response对象，它们属于同一个访问请求和响应过程
    // 地址栏没有变化
    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("testForward");
        return "forward:forward.jsp";
    }

    /*
     * 转发和跳转的小结       1、转发使用的是getRequestDispatcher()方法;重定向使用的是sendRedirect();      
     * 2、转发：浏览器URL的地址栏不变。重定向：浏览器URL的地址栏改变；       3、转发是服务器行为，重定向是客户端行为；      
     * 4、转发是浏览器只做了一次访问请求。重定向是浏览器做了至少两次的访问请求；      
     * 5、转发2次跳转之间传输的信息不会丢失，重定向2次跳转之间传输的信息会丢失（request范围）。
     */
}
