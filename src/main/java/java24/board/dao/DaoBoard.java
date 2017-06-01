package java24.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java23.mybatis.infc.IBook;
import java23.mybatis.infc.IDaoBook;
import java23.mybatis.model.ModelBook;
import java24.board.infc.IDaoBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IDaoBoard {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    public DaoBoard() {
    }

    public SqlSession getSession() {
        return session;
    }

    public void setSession(SqlSession session) {
        this.session = session;
    }

	@Override
	public String getBoardName(String boardcd) throws Exception {
        String result=null;
        result = session.selectOne("mapper.mapperBoard.getBoardName", boardcd);
        return result;
	}

	@Override
	public ModelBoard getBoardOne(String boardcd) throws Exception {
        List<ModelBoard> result=null;
        result = session.selectList("mapper.mapperBoard.getBoardOne", boardcd);
        return result.get(0);
	}

	@Override
	public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result=null;
        result = session.selectList("mapper.mapperBoard.getBoardList");
        return result;
	}

	@Override
	public List<ModelBoard> getBoardListResultMap() throws Exception {
        List<ModelBoard> result=null;
        result = session.selectList("mapper.mapperBoard.getBoardListResultMap");
        return result;
	}

	@Override
	public int insertBoard(ModelBoard board) throws Exception {
        int result= -1;
        result = session.insert("mapper.mapperBoard.insertBoard",board);
        return result;
	}

	@Override
	public int updateBoard(ModelBoard searchValue, ModelBoard updateValue) throws Exception {
        int result= -1;
        Map<String,ModelBoard> map = new HashMap<String,ModelBoard>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);        
        result = session.update("mapper.mapperBoard.updateBoard",map);
        return result;
	}

	@Override
	public int deleteBoard(ModelBoard board) throws Exception {
        int result= -1;
        result = session.delete("mapper.mapperBoard.deleteBoard",board);
        return result;
	}

	@Override
	public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result=null;
        result = session.selectList("mapper.mapperBoard.getBoardSearch",board);
        return result;
	}

	@Override
	public List<ModelBoard> getBoardPaging(ModelBoard board) throws Exception {
        List<ModelBoard> result=null;
        result = session.selectList("mapper.mapperBoard.getBoardPaging",board);
        return result;
	}

	@Override
	public int insertBoardList(List<ModelBoard> board) throws Exception {
        int result= -1;
        result = session.insert("mapper.mapperBoard.insertBoardList",board);
        return result;
	}

	@Override
	public int getArticleTotalRecord(ModelBoard article) throws Exception {
        int result= -1;
        result = session.selectOne("mapper.mapperBoard.getArticleTotalRecord", article);
        return result;
	}

	@Override
	public List<ModelArticle> getArticleList(HashMap<String,Object> data) {
        List<ModelArticle> result=null;
        result = session.selectList("mapper.mapperBoard.getArticleList",data);
        return result;
	}

	@Override
	public ModelArticle getArticle(Integer articleNo) {
        List<ModelArticle> result=null;
        result = session.selectList("mapper.mapperBoard.getArticleList",articleNo);
        return result.get(0);
	}

	@Override
	public int insertArticle(ModelArticle article) {
        int result= -1;
        result = session.insert("mapper.mapperBoard.insertArticle", article);
        return result;
	}

	@Override
	public int updateArticle(HashMap<String,ModelArticle> data) {
        int result= -1;
        result = session.update("mapper.mapperBoard.updateArticle",data);
        return result;
	}

	@Override
	public int deleteArticle(ModelArticle target) {
        int result= -1;
        result = session.delete("mapper.mapperBoard.deleteArticle",target);
        return result;
	}

	@Override
	public int increaseHit(int articleNo) {
        int result= -1;
        result = session.update("mapper.mapperBoard.increaseHit",articleNo);
        return result;
	}


	@Override
	public ModelAttachFile getAttachFile(int attachFileNo) {
        List<ModelAttachFile> result=null;
        result = session.selectList("mapper.mapperBoard.getAttachFile",attachFileNo);
        return result.get(0);
	}

	@Override
	public ModelAttachFile getAttachFileList(int articleNo) {
        List<ModelAttachFile> result=null;
        result = session.selectList("mapper.mapperBoard.getAttachFile",articleNo);
        return result.get(0);
	}

	@Override
	public int insertAttachFile(ModelAttachFile file) {
        int result= -1;
        result = session.insert("mapper.mapperBoard.insertAttachFile",file);
        return result;
	}

	@Override
	public int deleteAttachFile(ModelAttachFile target) {
        int result= -1;
        result = session.delete("mapper.mapperBoard.deleteAttachFile",target);
        return result;
	}

	@Override
	public ModelComments getComment(int commentNo) {
        List<ModelComments> result=null;
        result = session.selectList("mapper.mapperBoard.getComment",commentNo);
        return result.get(0);
	}

	@Override
	public ModelComments getCommentList(int articleNo) {
        List<ModelComments> result=null;
        result = session.selectList("mapper.mapperBoard.getCommentList",articleNo);
        return result.get(0);
	}

	@Override
	public int insertComment(ModelComments comment) {
        int result= -1;
        result = session.insert("mapper.mapperBoard.insertComment",comment);
        return result;
	}

	@Override
	public int deleteComment(ModelComments target) {
        int result= -1;
        result = session.delete("mapper.mapperBoard.deleteComment",target);
        return result;
	}

	@Override
	public ModelArticle getNextArticle(HashMap<String, Object> articleMap) {
        List<ModelArticle> result=null;
        result = session.selectList("mapper.mapperBoard.getNextArticle",articleMap);
        return result.get(0);
	}

	@Override
	public ModelArticle getPrevArticle(HashMap<String, Object> articleMap) {
        List<ModelArticle> result=null;
        result = session.selectList("mapper.mapperBoard.getPrevArticle",articleMap);
        return result.get(0);
	}

	@Override
	public int updateComment(HashMap<String, ModelComments> commentMap) {
        int result= -1;
        result = session.update("mapper.mapperBoard.updateComment",commentMap);
        return result;
	}

}
