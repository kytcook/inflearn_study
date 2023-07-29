package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan Scan(// @Component 애너테이션을 찾아서 자동으로 스프링빈 등록
        // @Configuration을 제외시키는 이유는, 이 애너테이션도 안에 @Component가 포함되어있어서 자동으로 빈 등록되버림.
        // 근데 AppConfig에 이미 붙어있기 때문에, 제외 시켜야함. AppConfig는 수동으로 빈을 등록했기 때문에.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
