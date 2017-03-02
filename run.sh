#!/bin/zsh
rm -fr bin/
ant build
adb push bin/click.jar data/local/tmp
##运行该类下所有用例
#adb shell uiautomator runtest click.jar -c com.pos.StartCashier
#运行该类下指定用例
adb shell uiautomator runtest click.jar -c com.pos.StartCashier#testtg -e phone 18293848483
##顺序执行该类下多个用例
#adb shell uiautomator runtest click.jar -c com.pos.StartCashier#testsh -c com.pos.StartCashier#testtg -c com.pos.StartCashier#testsy