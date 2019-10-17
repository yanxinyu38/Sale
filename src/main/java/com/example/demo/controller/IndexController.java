package com.example.demo.controller;

import com.example.demo.common.web.BaseController;
import com.example.demo.entity.Product;
import com.example.demo.entity.Sale;
import com.example.demo.entity.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.SaleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class IndexController  extends BaseController {

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @Autowired
    SaleService saleService;

    /**
     * PostMapping专门处理post请求
     * @param userName 用户名
     * @param password 密码
     * @return 登录成功的json串
     */
    @PostMapping("/login")
    public String login(String userName, String password, HttpSession session){
        User user = userService.login(userName,password);
        session.setAttribute("user",user);
        return dealSuccessResutl("登录成功",user);
    }

    /**
     * 获得所有的商品
     * @return
     */
    @PostMapping("/getAllProducts")
    public String getAllProducts() {
        List<Product> products = productService.getAllProduct();
        return dealQueryResult(products,products);
    }

    /**
     * 添加销售
     * @param sale
     * @return
     */
    @PostMapping("/addSale")
    public String addSale(Sale sale,HttpSession session) {
        User user = (User)session.getAttribute("user");
        sale.setUserId(user.getId());
        if(saleService.addSale(sale)) {
            return dealSuccessResutl("添加销售成功",sale);
        }
        return null;
    }

    /**
     * 根据排序条件查询销售信息
     * @param order
     * @return
     */
    @PostMapping("/querSaleByOrder")
    public String querSaleByOrder(String order) {
        List<Sale> sales = saleService.getSalesByOrder(order);
        return dealQueryResult(sales,sales);
    }

    /**
     * 根据商品的id查询库存信息
     * @param id
     * @return
     */
    @PostMapping("/getProductQuantityById")
    public String getProductQuantityById(int id) {
        int count = productService.getProductQuantityById(id);
        return dealQueryResult(count,count);
    }

}
