package per.lhq.tools.bean;

import java.io.Serializable;

public class RegisterUserMobilePhoneRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mobile;
	private String password;
	private String ip;
	private Long channelId;// 下载渠道
	private Long productId;// 产品
	private String version;// 版本
	private String subModel;// 子机型号
	private String regSource;// 注册渠道
	private String parModel;// 设备来源

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSubModel() {
		return subModel;
	}

	public void setSubModel(String subModel) {
		this.subModel = subModel;
	}

	public String getRegSource() {
		return regSource;
	}

	public void setRegSource(String regSource) {
		this.regSource = regSource;
	}

	public String getParModel() {
		return parModel;
	}

	public void setParModel(String parModel) {
		this.parModel = parModel;
	}

}
