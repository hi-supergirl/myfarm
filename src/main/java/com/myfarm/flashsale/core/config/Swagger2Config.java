package com.myfarm.flashsale.core.config;

import com.myfarm.flashsale.core.modules.common.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Value("${server.servlet.contextPath}")
    private String contextPath;
    @Value("${server.port}")
    private int port;

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .globalResponseMessage(RequestMethod.GET, globalResponseMessageInInfo())
                .globalResponseMessage(RequestMethod.POST, globalResponseMessageInInfo())
                .globalResponseMessage(RequestMethod.PUT, globalResponseMessageInInfo())
                .globalResponseMessage(RequestMethod.DELETE, globalResponseMessageInInfo())
                .apiInfo(apiInfo())
                .host(hostInfo())
                .tags(new Tag("User", "用户及用户角色相关操作"), moreTagInfo())
                .select()
                //为当前包下controller生成API文档
                .apis(RequestHandlerSelectors.basePackage("com.myfarm.flashsale.core"))
                //only generate Api document for controller with annotation @Api
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //only generate Api document for methods with @ApiOperation
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(Constants.API_TITLE)
                .description(Constants.project_description)
                .contact(new Contact("Juan","http://juan.com", "lvlajzhao1983@gmail.com"))
                .version(version())
                .build();
    }

    private Tag[] moreTagInfo(){
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(new Tag("provider", "供应商相关操作"));
        tags.add(new Tag("production", "商品相关操作"));
        tags.add(new Tag("site", "自提店相关操作"));
        tags.add(new Tag("audit", "审计相关操作"));
        tags.add(new Tag("cart", "购物车相关操作"));
        tags.add(new Tag("order", "订单相关操作"));
        tags.add(new Tag("payment", "支付相关操作"));
        Tag[] res = new Tag[tags.size()];
        return tags.toArray(res);
    }

    private String hostInfo(){
        String base_url = String.format("%s:%d", Constants.host, port);
        return base_url;
    }

    private String version(){
        String version = contextPath.split("/")[1];
        return version;
    }

    private List<ResponseMessage> globalResponseMessageInInfo(){
        List<ResponseMessage> responseMessageList = new ArrayList<>();
        responseMessageList.add(new ResponseMessageBuilder().code(400).message("参数校验异常").responseModel(new ModelRef("FarmResponse")).build());
        responseMessageList.add(new ResponseMessageBuilder().code(401).message("越权").responseModel(new ModelRef("FarmResponse")).build());
        responseMessageList.add(new ResponseMessageBuilder().code(404).message("找不到资源").responseModel(new ModelRef("FarmResponse")).build());
        responseMessageList.add(new ResponseMessageBuilder().code(409).message("业务逻辑异常").responseModel(new ModelRef("FarmResponse")).build());
        return responseMessageList;
    }
}
