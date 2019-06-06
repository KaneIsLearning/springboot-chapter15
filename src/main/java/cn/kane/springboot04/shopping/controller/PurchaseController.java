package cn.kane.springboot04.shopping.controller;

import cn.kane.springboot04.shopping.commons.Result;
import cn.kane.springboot04.shopping.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/6/6 10:09
 * @since 1.0.0
 */
@RestController
@RequestMapping("/")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @RequestMapping("/index")
    public String showIndex(){
        return "SPRING INDEX";
    }
    //定义JSP视图
    @GetMapping("/test")
    public ModelAndView testPage(){
        ModelAndView mv = new ModelAndView("test");
        return mv;
    }

    @PostMapping("/purchase")
    public Result purchase(Long userId,Long productId,Integer quantity){
        boolean success = purchaseService.purchase(userId,productId,quantity);
        String message = success? "抢购成功":"抢购失败";
        Result result = new Result(success,message);
        return result;
    }




}