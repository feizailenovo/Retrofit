package com.xinke.retrofit;

import java.util.List;

public class BaseModel<T> {

    /**
     * 和你接口返回的参数类型名字保持一致，这里尽量使用包装类
     */

    private Integer code;
    private String msg;
    private List<T> data;

    @Override
    public String toString() {
        return "BaseModel{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
