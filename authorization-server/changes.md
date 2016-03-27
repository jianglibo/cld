## 2015年8月5日
* fix openId change on every request.

## 2015年6月26日
* Person和PersonVo增加了一个openId字段，一个32位的uuid

## 2015年6月21日
* 修正了person和role之间的关系，应该是manytomany
* 新增了/thtpl路径的controller，可以通过/thtpl?tpl=xxx要显示的模板。

## 2015年6月18日
* 初始化的用户改成ucenter，密码是随机产生的，请在debug.log里面查找secret字串。
