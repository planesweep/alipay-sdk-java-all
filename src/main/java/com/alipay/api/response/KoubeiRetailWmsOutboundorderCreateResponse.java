package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-01 17:25:00
 */
public class KoubeiRetailWmsOutboundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7321436854891728749L;

	/** 
	 * 出库通知单号
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}
	public String getOutboundOrderId( ) {
		return this.outboundOrderId;
	}

}