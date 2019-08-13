package com.rk3399.tool;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTool {
    //502机器
    public static final String irled = "/sys/bus/platform/devices/gpio_port/gpioport/irled";//红外补光
    public static final String ledred ="/sys/bus/platform/devices/gpio_port/gpioport/ledred";//红色灯
    public static final String ledgre ="/sys/bus/platform/devices/gpio_port/gpioport/ledgre";//绿
    public static final String dsled3 ="/sys/bus/platform/devices/gpio_port/gpioport/dsled3";//白光补光灯2（dsled3）
    public static final String dsled2 ="/sys/bus/platform/devices/gpio_port/gpioport/dsled2";//白光补光灯1（dsled2）

    //602机器
    public static final String irled602="/sys/devices/platform/gpioport/gpioport/ir_led";//红外 602
    public static final String dsled602="/sys/devices/platform/gpioport/gpioport/ds_led_flash";// 白色补光 602
    public static final String redled602="/sys/devices/platform/gpioport/gpioport/led_blue";//红led
    public static final String greled602="/sys/devices/platform/gpioport/gpioport/led_gre";//绿灯
    public static final String blueled602="/sys/devices/platform/gpioport/gpioport/led_red";//蓝灯
    /***************新205  /sys/bus/platform/devices/gpioport/gpioport *************/
    public static final String forbid602="/sys/bus/platform/devices/gpioport/gpioport/forbid";//防拆
    public static final String mandet602="/sys/bus/platform/devices/gpioport/gpioport/mandet";//人体感应
    //gpio口控制 1上电 0断电
    public static final String  gpio1="/sys/bus/platform/devices/gpioport/gpioport/gpio1";
    public static final String  gpio2="/sys/bus/platform/devices/gpioport/gpioport/gpio2";
    public static final String  gpio3="/sys/bus/platform/devices/gpioport/gpioport/gpio3";
    public static final String  gpio4="/sys/bus/platform/devices/gpioport/gpioport/gpio4";
    //usb复位控制 0复位 1正常工作
    public static final String  hubrst="/sys/bus/platform/devices/gpioport/gpioport/hubrst";


    /**
     * 写系统节点
     * @param sys_path
     * @param value
     */
    public static void writeSysFile(String sys_path, String value){
        try {
            BufferedWriter bufWriter = null;
            bufWriter = new BufferedWriter(new FileWriter(sys_path));
            bufWriter.write(value);
            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("WriteTool","can't write the " + sys_path);
        }
        Log.e("WriteTool",(value.equals("1")?"开":"关")+sys_path);
    }

    /**
     * 读系统节点
     * @param sys_path
     * @return
     */
    public static String readSysFile(String sys_path){
        String valye="";
        try {
            BufferedReader bufferedReader = null;
            bufferedReader = new BufferedReader(new FileReader(new File(sys_path)));
            valye=bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("WriteTool","读取值异常了 ");
        }
        Log.e("WriteTool","读取值 " + valye);
        return valye;
    }
}
