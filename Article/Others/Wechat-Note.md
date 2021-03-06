# 微信开发笔记

这段时间一直在捣鼓微信相关的开发，微信体系庞杂，概念繁多，此笔记纯粹为了备忘。

## 基本概念

1. 不同类型的id

   | ID类型  | 描述                                                         |
   | ------- | :----------------------------------------------------------- |
   | appId   | appID是**不同类型的产品的帐号ID**,是帐号的**唯一标识符**，例如公众号的AppID、小程序的AppID、开放平台的AppID、第三方平台的AppID、移动应用的AppID、网站应用的AppID、小商店的AppID等等 |
   | openid  | openid是微信用户在**不同类型的产品的身份ID**; 微信用户访问公众号、小程序、移动应用、网站应用、小商店等都会有唯一的openid，但同一个微信用户访问不同的产品生成的openid也是不一样的 |
   | unionid | unionid是微信用户在**同一个开放平台**下的产品的身份ID, 如果开发者拥有多个移动应用、网站应用、和公众帐号（即公众号和小程序），**可通过 UnionID 来区分用户的唯一性**，因为只要是同一个微信开放平台帐号下的移动应用、网站应用和公众帐号，用户的 UnionID 是唯一的。即，同一用户，对同一个微信开放平台下的不同应用，UnionID是相同的。 |

2. 不同平台

   | 平台                                      |                                                              |
   | ----------------------------------------- | ------------------------------------------------------------ |
   | 微信开放平台                              | 管理接入微信的三方应用，用户在同一个开放平台下拥有唯一的unionId |
   | [微信公众平台](https://mp.weixin.qq.com/) | 管理微信公众号、微信小程序                                   |

## 微信三方平台

> [第三方平台](https://developers.weixin.qq.com/doc/oplatform/Third-party_Platforms/2.0/getting_started/how_to_read.html)

## 微信支付服务商

> [微信支付文档](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/pages/index.shtml)

