java的值在传递的时候，实际是将引用复制一份，并指向同一快内存

直接操作里面的方法其实方法内和方法外是相同的对象，但是如果方法内的引用指向新的内存区域
其实外部的引用并没有发生改变，此时两个引用操作的对象也就不一样了
![image](https://github.com/chenkangqin/image/blob/master/ParameterPass.png)