package java24.board.model;

import java.util.Date;

public class ModelComments {
	private Integer  commentno	=null;//		` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	private Integer  articleno	=null;//		` INT(10) UNSIGNED NOT NULL,
	private String   email		="";//		` VARCHAR(60) NULL DEFAULT NULL,
	private String   memo		="";//		` VARCHAR(4000) NULL DEFAULT NULL,
	private Date     regdate		=null;//	` DATETIME NULL DEFAULT NULL,
	private Boolean  UseYN		=null;//		` TINYINT(1) NULL DEFAULT '1',
	private String   InsertUID	="";//		` VARCHAR(40) NULL DEFAULT NULL,
	private Date     InsertDT		=null;//		` DATETIME NULL DEFAULT NULL,
	private String   UpdateUID	="";//		` VARCHAR(40) NULL DEFAULT NULL,
	private Date  	 UpdateDT		=null;//		` DATETIME NULL DEFAULT NULL,

	public ModelComments() {
		 commentno	=null;//		
		 articleno	=null;//		
		 email		="";//		` VA
		 memo		="";//		` VA
		 regdate		=null;//	
		 UseYN		=null;//		
		 InsertUID	="";//		` VA
		 InsertDT		=null;//	
		 UpdateUID	="";//		` VA
		 UpdateDT		=null;//		
	}

	public Integer getCommentno() {
		return commentno;
	}

	public void setCommentno(Integer commentno) {
		this.commentno = commentno;
	}

	public Integer getArticleno() {
		return articleno;
	}

	public void setArticleno(Integer articleno) {
		this.articleno = articleno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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
		String toreturn = "Comments{"
		+"commentno="+		commentno	
		+",articleno="+		articleno	
		+",email="+		email		
		+",memo="+		memo		
		+",regdate="+		regdate	
		+",UseYN="+		UseYN		
		+",InsertUID="+		InsertUID	
		+",InsertDT="+		InsertDT	
		+",UpdateUID="+		UpdateUID	
		+",UpdateDT="+		UpdateDT	+"}";
		return toreturn;
	}
	
}
