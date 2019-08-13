package com.rk3399.tool;

public class Led602 {
    /**
     * 开红色led
     */
    public static void openLedRed() {
        closeAllLed();
        WriteTool.writeSysFile(WriteTool.redled602, "1");
    }

    /**
     * 开绿色led
     */
    public static void openLedGre() {
        closeAllLed();
        WriteTool.writeSysFile(WriteTool.greled602, "1");
    }

    /**
     * 开蓝色led
     */
    public static void openLedBlue() {
        closeAllLed();
        WriteTool.writeSysFile(WriteTool.blueled602, "1");
    }

    /**
     * 红外 led 补光灯
     */
    public static void openIrled() {
        WriteTool.writeSysFile(WriteTool.irled602, "1");
    }

    /**
     * 白色补光灯 led
     */
    public static void openDsled() {
        WriteTool.writeSysFile(WriteTool.dsled602, "1");
    }


    /**
     * 关闭所有led
     */
    public static void closeAllLed() {
        WriteTool.writeSysFile(WriteTool.irled602, "0");
        WriteTool.writeSysFile(WriteTool.dsled602, "0");
        WriteTool.writeSysFile(WriteTool.redled602, "0");
        WriteTool.writeSysFile(WriteTool.greled602, "0");
        WriteTool.writeSysFile(WriteTool.blueled602, "0");
    }

    /**
     * 人体感应值  1和0变动 说明有物体移动
     *
     * @return
     */
    public static String getBodyInduction() {
        return WriteTool.readSysFile(WriteTool.mandet602);
    }

    /**
     * 防拆开关 值 1按下（安装）  0松开
     *
     * @return
     */
    public static String getForbid() {
        return WriteTool.readSysFile(WriteTool.forbid602);
    }

    /**
     * 打开gpio 1
     */
    public static void openGpio1() {
        WriteTool.writeSysFile(WriteTool.gpio1, "1");
    }

    /**
     * 打开gpio 2
     */
    public static void openGpio2() {
        WriteTool.writeSysFile(WriteTool.gpio2, "1");
    }

    /**
     * 打开gpio 3
     */
    public static void openGpio3() {
        WriteTool.writeSysFile(WriteTool.gpio2, "1");
    }

    /**
     * 打开gpio 4
     */
    public static void openGpio4() {
        WriteTool.writeSysFile(WriteTool.gpio4, "1");
    }

    /**
     * 关闭所有gpio
     */
    public static void closeAllGpio() {
        WriteTool.writeSysFile(WriteTool.gpio1, "0");
        WriteTool.writeSysFile(WriteTool.gpio2, "0");
        WriteTool.writeSysFile(WriteTool.gpio3, "0");
        WriteTool.writeSysFile(WriteTool.gpio4, "0");
    }

    /**
     * 复位 usb  （断电）
     */
    public static void resetUsb() {
        WriteTool.writeSysFile(WriteTool.hubrst, "0");
    }
    /**
     * 恢复usb （上电正常工作）
     */
    public static void setUsbNormal() {
        WriteTool.writeSysFile(WriteTool.hubrst, "1");
    }

}
