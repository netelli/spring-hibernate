package com.study.webApp.controller;

import com.study.webApp.domen.Order;
import com.study.webApp.service.OrderService;
import com.study.webApp.service.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class OrderController {
    private OrderService orderService = new OrderServiceImpl();

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orderList", orders);
        return "order";
    }
}
