# steadyheart-api-sdk
## 1. 简介
通过sdk提供的方法仅需一行代码即可实现接口调用
## 2. 导航
* steadyheart-api接口开放平台
* steadyheart-api-sdk-document
## 3. 快速开始
### 3.1 引入依赖
### 3.2 前往steadyheart-api接口开放平台获取开发者凭证
### 3.3 初始化客户端对象
* 方法1：手动实例化客户端对象
  ```java
  String accessKey = "你的accessKey";
  String secretKey = "你的secretKey";
  SteadyheartClient client = new SteadyheartClient(accessKey, secretKey);
    ```
* 方法2：通过配置文件注入对象
  * yml
    ```yml
    steadyheart:
      api:
        client:
          accessKey: 你的accessKey
          secretKey: 你的secretKey
    ```
  * properties
    ```properties
    steadyheart.api.client.accessKey=你的accessKey
    steadyheart.api.client.secretKey=你的secretKey
    ```
### 3.4 注入ApiService
  ```java
@Resource
private ApiService apiService;
```
### 3.5 发起请求

示例：查询IP归属地

* 示例一

  ```java
      @GetMapping("/ip")
      public BaseResponse<IpInfoResponse> getIpInfo(IpInfoParams ipInfoParams) {
          return apiService.getIpInfo(ipInfoParams);
      }
  ```



* 实例二

  ```java
      @GetMapping("/ip/client")
      public BaseResponse<IpInfoResponse> getIpInfoWithClient(IpInfoParams ipInfoParams) {
          SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
          return apiService.getIpInfo(steadyheartClient,ipInfoParams);
      }
  ```



响应：

```text
{
  "code": 0,
  "data": {
    "country": "中国",
    "prov": "北京",
    "city": "-",
    "isp": "北京百度网讯科技有限公司BGP节点"
  },
  "message": "ok"
}
```

## 更多接口详见steadyheart-api-sdk-document
## 联系我们
如果您对steadyheart-api接口开放平台有任何问题或建议，请随时联系我们，邮箱：steadyheart0511@163.com。
