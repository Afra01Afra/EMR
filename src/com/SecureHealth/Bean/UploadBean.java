package com.SecureHealth.Bean;

public class UploadBean {
	

	private String filename;
	private String to;
	private String type;
	private String path;
	private String content;
	private String size;
	private String key;
	private String encrypt;
	private String decrypt;
	private String username;
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPath(){
		return path;
	}
	
	public void setPath(String path){
		this.path = path;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getEncrypt() {
		return encrypt;
	}
	
	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}
	
	public String getDecrypt() {
		return decrypt;
	}
	
	public void setDecrypt(String decrypt){
		this.decrypt = decrypt;
	}
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}


}
