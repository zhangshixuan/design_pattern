package com.xuan.design.behavior_type.template;

public abstract class SoyaMilk {

    //制作豆浆流程
    protected final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }
    //选材料
    private void select() {
        System.out.println("第一步，选择上好的黄豆");
    }
    //添加不同的配料， 抽象方法, 子类具体实现
    protected abstract void addCondiments();

    private void soak() {
        System.out.println("第三步，黄豆和配料开始浸泡， 需要3小时 ");
    }
    private void beat() {
        System.out.println("第四步，黄豆和配料放到豆浆机去打碎");
    }
}
