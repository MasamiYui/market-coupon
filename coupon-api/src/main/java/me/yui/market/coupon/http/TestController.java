package me.yui.market.coupon.http;

import lombok.extern.slf4j.Slf4j;
import me.yui.market.coupon.basic.Response;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coupon/health")
@Validated
@Slf4j
public class TestController {
    @GetMapping("/hello")
    public Response<String> queryById() {
        return Response.of("hello coupon!");
    }

}
