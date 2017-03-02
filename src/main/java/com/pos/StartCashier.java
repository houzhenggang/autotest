package com.pos;

import android.os.Bundle;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Created by zhaojianing on 17/3/1.
 */
public class StartCashier extends UiAutomatorTestCase {
    public void testsy() throws UiObjectNotFoundException {
        getUiDevice().pressHome();
        UiObject ui = new UiObject(new UiSelector().textContains("开始收银"));
        ui.click();
        UiObject u1 = new UiObject(new UiSelector().textContains("0"));
        u1.click();
        UiObject u2 = new UiObject(new UiSelector().textContains("."));
        UiObject u4 = new UiObject(new UiSelector().textContains("1"));
        u4.click();
        UiObject wx = new UiObject(new UiSelector().text("微信"));
        wx.click();
    }

        public void testtg() throws UiObjectNotFoundException {
           getUiDevice().pressHome();
           UiObject ui=new UiObject(new UiSelector().textContains("团购验券"));
            try {
                ui.click();
            } catch (UiObjectNotFoundException e) {
                e.printStackTrace();
                sleep(2000);
                Bundle bundle=getParams();
                String phone=bundle.getString("phone");
                System.out.println("PHONE:"+phone);

            }
        }
        public void testsh() throws UiObjectNotFoundException {
        getUiDevice().pressHome();
        UiObject ui=new UiObject(new UiSelector().textContains("闪惠买单"));
        ui.click();
            sleep(1000);
        }

}
