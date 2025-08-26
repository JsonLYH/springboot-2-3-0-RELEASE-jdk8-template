package com.template.springboot230releasejdk8template.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增填充创建时间
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("createTimestamp",System.currentTimeMillis(),metaObject);
        this.setFieldValByName("updateTimestamp",System.currentTimeMillis(),metaObject);
    }

    /**
     * 更新填充更新时间
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("updateTimestamp",System.currentTimeMillis(),metaObject);
    }
}
