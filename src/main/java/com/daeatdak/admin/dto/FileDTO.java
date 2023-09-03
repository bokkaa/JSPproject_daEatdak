package com.daeatdak.admin.dto;

public class FileDTO {
	private String filePath;
	private String fileSystemName;
	private String fileOriginalName;
	private int goodsNumber;

	public FileDTO() {
		;
	}

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

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	public int getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	@Override
	public String toString() {
		return "FileDTO [filePath=" + filePath + ", fileSystemName=" + fileSystemName + ", fileOriginalName="
				+ fileOriginalName + ", goodsNumber=" + goodsNumber + "]";
	}

	
	

}
