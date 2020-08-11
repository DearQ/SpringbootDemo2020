package com.t05g1.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092600603646";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDHWflcSKW82luE4ZD/NeG78jDqgx+H4xX4O5eMOILHDtbmKFYrAMBTersIxVIbKUQuWS887kSIFWZ9KhbLF/camkfKbGalFnRN1xCZxPg69cCc5WdtqE4Uf5KuIVrG623/OYNUactch6r4+YjIb506I374dLXW/iWhlA1uKWgj7Y/9/WxE85Zvbj7X9QadL9BfcjiLte8eqUwXcGM1OSbxh41EixbuuN+EWsNebzQBxj+i5lSDPa1INjjP58jmC8ojbY+SB1m5mxESjFlbZwN1rR0shcfCgvdRyPtMaZbO4CB95OWfxjVqIipftP5c9nYT3rzi+yfubtbKUsOFDgQFAgMBAAECggEAbishDYjwXw/lZ+goc4HZgD52HgPc1wH+UDLOq6VHUK64wHUmOZmur/OxjUVO/MevcFXFL00V/oalHyK1egOCgeclKY8CotVn7OSfvfsGm77YdVyp7gYHMHjYHPc97ZSKM3QbSfk1c6teJz3wA6T7JPgc4T3OiEPnlAX37htf/AoBdvj8bMRexk4hNMpO35KyL/4PrJqaZWZ20Hf5/nquf1tvTpN9Zcl+Z54AulavaXK29uZdHvr7DVc5Ae81h7DPk79N8tyvMHXX7/N6KqGLeDL4JfL/OPZkvzvLfBGI8LY3diLdxujQ730Xg9spoSJT06X9PuwY+jCVqwjtRl5duQKBgQDtv6huLOwr+W7Ct+FMMgTXyKNe2sSiQvHF/Yz8gYdrSHb8jYamWASetspSmbOmYbUmYgBx/dxEWvWcySvxzigSUJGqc3dz3L6I9BQP0ABRloF/emAtZ+i2s1CZRRhRTxHLjVRtMLalX6WFv0uzrNo9pBuJ11gJT+/G1t2ySg1yewKBgQDWp7egxAJqLGV4Saug5yKIfrerLVCIE5fFf0x9UTpbRtRwBE+MPrnD2w/St/xM+kHscXKoOeskiBMdia4BFjuuZ5zDVOm1HJFg7wuwX59BNGk8LM1eN4+CuXekitZcUGIzGBolx1Nc67m0xy7pQZrHX0CSG5aCrRMEY9M3CWnbfwKBgFQDkUp1t3OGrlxCzGu3lTyHmyuu1SOd0oArrEGiqC8CKYHvpTBtFBzd7TspM3HNP01z/kJJ+idxmS+xa0UEm+Z08DSynvijffU5g0lfMG2kaNiabxg8iuDdFtNCtmgtL9WleLspJrHjzcMoqWCx6WE098JLBcIsrEewsCELyBq3AoGAUtRrJk0chW3WReFfqfomuDb1lscooSm2Ug56LI1QkHI3fXYcYAjAVBRO+cfnQqj7EUsBrGqVEwazIZ3EGEVFCFqRAkrc1/dLHfWANDHh2R5pUUAUizuzVAVPZp3wc7TM/9xYEqXkxCFuCpUlw/p9yFs4Jmkg3hH9GZ+PnFg0ke8CgYEAjqHYjgDjjYay4VvPnPNIFO3nOJko4HFr/R6hzt3a1psu1inBnOzn/rKk0UWO1P8QhzMWr0KCGicKPJj0TESgMZtotW9ymHTw0qUqitCeDYicHCPnIeQnaNb9KbwFchBwN/JAnJ5iQspcx3vlt3RBCc043/czZA1N4hzjIAKsu3g=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAximnbcDuLv5c9jvpcYRAiIHt6OPNHN8X/qrOrcZKlwBED/WfArCzwOxjsSK10CUSM2SkmHoHqFqm3xrThSIQgkRHOUN/0U+M8wKhwRqUjsTp8P5Qa7jdI+d3lzPOIaNsCdbW15PK5b9MY1qqLjFM7RTYHfevh9dHWt0SoAEnly6fEJ3maa7UCt8Mf4TENRp7fR6jrenn9+YpslRwcuwbp/N7yNzmPAxgKXhfTME6dN3qGJYf3t92zHxVUm4FQdVEyTav5nNse8B3qCaGi5D5VqJPEIoVnjbfdPgKfEuXqQLt6siq+YOj2jsS8n4qLBk5Drc2FGG/zWH1nO1dEs3buwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

