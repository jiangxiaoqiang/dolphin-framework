package dolphin.org.springframework.security.samples.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jiangxiaoqiang on 2016/11/30.
 */
public class MessageWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfiguration.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];
    }

    protected String[] getServletMappings() {
        return new String[0];
    }
}
