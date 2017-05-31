package java24.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class DaoBoard implements IBoard {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public String getBoardName(String boardcd) throws Exception {
        String result = null;
        result = session.selectOne("mapper.mapperBoard.getBoardName",boardcd);
        return result;
    }

    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        ModelBoard result = null;
        result = session.selectOne("mapper.mapperBoard.getBoardName",boardcd);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardList");
        return result;
    }

    @Override
    public List<ModelBoard> getBoardListResultMap() throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardListResultMap");
        return result;
    }

    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertBoard",board);
        return result;
    }

    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue)
            throws Exception {
        int result = -1;
        Map<String,ModelBoard> map = new HashMap<String,ModelBoard>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        result = session.update("mapper.mapperBoard.updateBoard",map);
        return result;
    }

    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteBoard",board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardSearch");
        return result;
    }

    @Override
    public List<ModelBoard> getBoardPaging(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardPaging");
        return result;
    }

    @Override
    public int insertBoardList(List<ModelBoard> board) throws Exception {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertBoardList",board);
        return result;
    }

    @Override
    public int getArticleTotalRecord(ModelBoard article) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ModelArticle getArticleList(HashMap data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelArticle getArticle(Integer articleNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateArticle(HashMap data) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteArticle(ModelArticle target) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int increaseHit(int articleNo) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ModelArticle getNextArticle(HashMap articleMap) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelArticle getPrevArticle(HashMap articleMap) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelAttachFile getAttachFile(int attachFileNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelAttachFile getAttachFileList(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertAttachFile(ModelAttachFile file) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile target) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ModelComments getComment(int commentNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelComments getCommentList(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertComment(ModelComments comment) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateComment(HashMap commentMap) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteComment(ModelComments target) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
