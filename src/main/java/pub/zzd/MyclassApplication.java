package pub.zzd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pub.zzd.dao")
public class MyclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyclassApplication.class, args);
    }

}
