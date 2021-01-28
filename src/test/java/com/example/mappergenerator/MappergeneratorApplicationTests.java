package com.example.mappergenerator;

import com.jt.mapper.kUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
@MapperScan("com.jt.mapper")
@SpringBootTest
class MappergeneratorApplicationTests {

    @Resource
    private kUserMapper kUserMapper;
    @Test
    void contextLoads() {
    }
    /**
     * SELECT id,name,age,create_time,update_time,deleted
     * FROM tk_user
     * WHERE id in (1,2,3,4,5);
     *
     * selectByIdList底层也是用IN
     */
    @Test
    public void testSelectBatch() {
        List<Long> ids = Arrays.asList(1L, 2L, 3L, 4L, 5L);
        kUserMapper.selectByIdList(ids);
    }

}
