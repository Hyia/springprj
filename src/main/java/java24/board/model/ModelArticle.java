package java24.board.model;

import java.util.Date;

public class ModelArticle {
	private Integer		 articleno		=  	   null;//           	`       INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	private String		 boardcd  		=      "";//         	` V      ARCHAR(20) NULL DEFAULT NULL,
	private String		 title			=      "";//       	` VAR      CHAR(200) NOT NULL,
	private String 		 content		=      "";//       	` M      EDIUMTEXT NULL,
	private String		 email			=      "";//       	` VAR      CHAR(60) NULL DEFAULT NULL,
	private Integer 	 hit			=      null;//       	` INT(10) UNSIGNED NULL DEFAULT '0',
	private Date		 regdate		=      null;//       	` DATETIME NULL DEFAULT NULL,
	private Boolean		 UseYN			=      null;//       	` TIN      YINT(1) NOT NULL DEFAULT '1',
	private String		 InsertUID    	=      "";//       	   VARCHAR(40) NULL DEFAULT NULL,
	private Date		 InsertDT       =      null;//       	  DATETIME NULL DEFAULT NULL,
	private String		 UpdateUID    	=      "";//          VARCHAR(40) NULL DEFAULT NULL,
	private Date		 UpdateDT       =      null;//       	  DATETIME NULL DEFAULT NULL,
	
	
	
	public ModelArticle() {
		 articleno		=  	   null;
		 boardcd  		=      "";
		 title			=      "";
		 content		=      "";
		 email			=      "";
		 hit			=      null;
		 regdate		=      null;
		 UseYN			=      null;
		 InsertUID    	=      "";
		 InsertDT       =      null;
		 UpdateUID    	=      "";
		 UpdateDT       =      null;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getHit() {
		return hit;
	}
	public void setHit(Integer hit) {
		this.hit = hit;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Boolean getUseYN() {
		return UseYN;
	}
	public void setUseYN(Boolean useYN) {
		UseYN = useYN;
	}
	public String getInsertUID() {
		return InsertUID;
	}
	public void setInsertUID(String insertUID) {
		InsertUID = insertUID;
	}
	public Date getInsertDT() {
		return InsertDT;
	}
	public void setInsertDT(Date insertDT) {
		InsertDT = insertDT;
	}
	public String getUpdateUID() {
		return UpdateUID;
	}
	public void setUpdateUID(String updateUID) {
		UpdateUID = updateUID;
	}
	public Date getUpdateDT() {
		return UpdateDT;
	}
	public void setUpdateDT(Date updateDT) {
		UpdateDT = updateDT;
	}
	
	
	@Override
	public String toString() {
		String toreturn = "ModelArticle{"
		+"articleno="+ articleno+","
		+"boardcd="  + boardcd  +","
		+"title="    +title	    +","
		+"content="            +content   +","
		+"email="            +email	    +","
		+ "hit="           +hit	    +","
		+ "regdate="           +regdate   +","
		+ "useyn="           +UseYN	    +","
		+ "iuid="           +InsertUID +","
		+ "idt="           +InsertDT  +","
		+ "uuid="           +UpdateUID +","
		+ "udt="           +UpdateDT   +"}";
		return toreturn;
	}
	
	
	
	

}
