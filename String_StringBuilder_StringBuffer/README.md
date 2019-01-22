* Java 字符串拼接，注意点：
1. 在循环体中进行字符串拼接，使用 StringBuilder.append 方法。
2. 如果不是在循环体中进行字符串拼接的话，直接使用 + 就好了。
3. 如果在并发场景中进行字符串拼接的话，要使用 StringBuffer 来代替 StringBuilder。
4. 字符串操作，最好用 StringBuilder。

* 出处：https://mp.weixin.qq.com/s/wrQNjMHP9UCbSEu00-P6ng