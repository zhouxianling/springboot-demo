package com.example.hellodemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author xianLing.zhou
 * @since 2019/4/17
 */
@RestController    // 在hello!spring boot 一文中我们使用的是，@Controller加上的@ResponseBody的注解，这里使用@RestController就相当于两者结合。
@RequestMapping("/api/v1.1/")  //  这样是符合REST的，使用api作为上下文，v1.1标识版本
public class RESTController {

    @GetMapping("/{id}")
    public Object detail(@PathVariable Long id) {
        //TODO 这里我们是模拟假设查询ID为1的详情，在实际项目中就是实际的查询逻辑
        if (id == 1) {
            return "这是ID为1的详情";
        }
        return null;
    }


}
