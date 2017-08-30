package com.onlyisssilence.muya;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App 
{

    /**
     * sun本身自带的日志工具
     * import java.util.logging.LogManager;
     * import java.util.logging.Logger;
     */
//    public final static Logger logger = LogManager.getLogManager().getLogger("");

    /**
     * apach下的log4j日志工具
     * import org.apache.log4j.LogManager;
     * import org.apache.log4j.Logger;
     *
     * <dependency>
     * <groupId>log4j</groupId>
     * <artifactId>log4j</artifactId>
     * <version>1.2.17</version>
     * </dependency>
     */
//    public final static Logger logger = LogManager.getLogger(App.class.getName());


    /**
     * common logging 包装了sun自己的log工具和apach下的log4j工具
     * import org.apache.commons.logging.Log;
     * import org.apache.commons.logging.LogFactory;
     *
     * <dependency>
     * <groupId>commons-logging</groupId>
     * <artifactId>commons-logging</artifactId>
     * <version>1.2</version>
     * </dependency>
     */
    public final static Log logger = LogFactory.getLog(App.class.getName());

    /**
     * Logback 基于slf4j
     * import org.slf4j.Logger;
     * import org.slf4j.LoggerFactory;
     *
     * <dependency>
     * <groupId>ch.qos.logback</groupId>
     * <artifactId>logback-classic</artifactId>
     * <version>1.2.3</version>
     * </dependency>
     */
//    public final static Logger logger = LoggerFactory.getLogger(App.class.getName());

    /**
     * apach下的log4j2日志工具 基于slf4j
     * import org.slf4j.Logger;
     * import org.slf4j.LoggerFactory;
     *
     * <dependency>
     * <groupId>org.springframework.boot</groupId>
     * <artifactId>spring-boot-starter-log4j2</artifactId>
     * <version>1.5.6.RELEASE</version>
     * </dependency>
     */
//    public final static Logger logger = LoggerFactory.getLogger(App.class.getName());


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info("日志测试！");
    }
}
