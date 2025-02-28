package com.daeatdak.admin.vo;

public class GoodsListVO {
	private int categoryNum;
	private String goodsName;
	private int goodsPrice;
	private String categoryName;
	private int goodsQuantity;
	private int goodsNum;
	private String filePath;
	private String fileSystemName;

	
	
	
	

	
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileSystemName() {
		return fileSystemName;
	}

	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public GoodsListVO() {
		;
	}



	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsQuantity() {
		return goodsQuantity;
	}

	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	@Override
	public String toString() {
		return "GoodsListVO [categoryNum=" + categoryNum + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", categoryName=" + categoryName + ", goodsQuantity=" + goodsQuantity + ", goodsNum=" + goodsNum
				+ ", filePath=" + filePath + ", fileSystemName=" + fileSystemName + "]";
	}


	

}
