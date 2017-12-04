package com.spring.ormVO;

public class BVO {
	private String bId;
	private String bName;
	private String bContent;
	
	public BVO(){
	}
	
	public BVO(String bId, String bName, String bContent){
		this.bId = bId;
		this.bName = bName;
		this.bContent = bContent;
	}

	
	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}	
}
