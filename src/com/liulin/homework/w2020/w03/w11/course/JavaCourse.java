package com.liulin.homework.w2020.w03.w11.course;

/**
 * Create by DbL on 2020/3/13
 */
public class JavaCourse extends AbstractCourse {
    private boolean needCheckHomework = false;

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查java作业");
    }
}
