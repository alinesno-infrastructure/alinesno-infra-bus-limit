package com.alinesno.infra.bus.limit.enmus;

/**
 * 枚举类型，表示限制状态
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
public enum LimitEnums {
    /**
     * 下单成功
     */
    ORDER_SUCCESS(0, "下单成功"),

    /**
     * 下单失败
     */
    ORDER_FAILURE(1, "下单失败"),

    /**
     * 排队中
     */
    QUEUEING(2, "排队中"),

    /**
     * 活动结束
     */
    ACTIVITY_END(3, "活动结束"),

    /**
     * 重复请求
     */
    DUPLICATE_REQUEST(4, "重复请求"),

    /**
     * 秒杀未进行
     */
    SECKILL_NOT_STARTED(5, "秒杀未进行"),

    /**
     * 系统异常
     */
    SYSTEM_EXCEPTION(9, "系统异常");

    private final int value;
    private final String description;

    LimitEnums(int value, String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * 获取枚举值对应的整数值
     * @return 整数值
     */
    public int getValue() {
        return value;
    }

    /**
     * 获取枚举值的描述信息
     * @return 描述信息
     */
    public String getDescription() {
        return description;
    }
}
