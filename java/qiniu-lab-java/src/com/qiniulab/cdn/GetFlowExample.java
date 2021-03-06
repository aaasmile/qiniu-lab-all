package com.qiniulab.cdn;

import com.qiniu.common.QiniuException;

public class GetFlowExample {

	public static void main(String[] args) {
		// ak,sk从 https://portal.qiniu.com/user/key 获取
		String ak = "";
		String sk = "";

		String domain = "sc.example.com";
		String startTime = "2016-06-30 18:00:00";
		String endTime = "2016-06-30 20:00:00";
		FusionCdn cdn = new FusionCdn(ak, sk);

		try {
			DomainFlowResult flowResult = cdn.getDomainFlow(domain, startTime, endTime);
			System.out.println(flowResult.getCode());
		} catch (QiniuException e) {
			if (e.response != null) {
				System.err.println(e.response.toString());
			}
		}
	}

}
