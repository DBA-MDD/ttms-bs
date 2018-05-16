package com.hepangda.ttms.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
// see document at https://github.com/alibaba/fastjson/wiki/JSONField
class AObject {
    @JSONField(name="pp")
    public int a = 3;
    @JSONField(name="rr")
    public double b = 4.0;
}

public class JsonExample {
    public static void main(String[] args) {
        AObject f = new AObject();
        String u = JSON.toJSONString(f);
        AObject v = JSON.parseObject(u, AObject.class);
        System.out.println(u);
        System.out.println(v.a + " " + v.b);
    }
}
