package io.github.zemise.reflect.annotation.demo2;

public class Record {
    // 注释字段
    @Field_Method_Parameter(describe = "编号", type = int.class)
    int id;

    @Field_Method_Parameter(describe = "姓名", type = String.class)
    String name;

    // 采用默认值注释构造方法
    @Constructor_Annotation
    public Record() {
    }

    public Record(
            @Field_Method_Parameter(describe = "编号", type = int.class) int id,
            @Field_Method_Parameter(describe = "姓名", type = String.class) String name) {
        this.id = id;
        this.name = name;
    }

    @Field_Method_Parameter(describe = "获得编号", type = int.class)
    public int getId() {
        return id;
    }

    @Field_Method_Parameter(describe = "设置编号", type = String.class)
    public void setId(int id) {
        this.id = id;
    }

    @Field_Method_Parameter(describe = "获得姓名", type = String.class)
    public String getName() {
        return name;
    }

    @Field_Method_Parameter(describe = "设置姓名", type = String.class)
    public void setName(String name) {
        this.name = name;
    }
}
