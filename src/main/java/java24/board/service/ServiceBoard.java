package java24.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import java23.mybatis.dao.DaoBook;
import java23.mybatis.infc.IDaoBook;
import java23.mybatis.infc.IServiceBook;
import java23.mybatis.model.ModelBook;
import java24.board.dao.DaoBoard;
import java24.board.infc.IDaoBoard;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Service("serviceboard")
public class ServiceBoard implements IServiceBoard {
    private static Logger log = LoggerFactory.getLogger(ServiceBoard.class);

    @Autowired
    @Qualifier("daoboard")
    private IDaoBoard dao;

    public IDaoBoard getDao() {
        return dao;
    }

    public void setDao(DaoBoard dao) {
        this.dao = dao;
    }

    public ServiceBoard() {}


	@Override
	public String getBoardName(String boardcd) throws Exception {
        String result=null;
        try {
            result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            log.error( "getBoardName"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelBoard getBoardOne(String boardcd) throws Exception {
		ModelBoard result=null;
        try {
            result = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            log.error( "getBoardOne"+e.getMessage() );
        }
        return result;
	}

	@Override
	public List<ModelBoard> getBoardList() throws Exception {
		List<ModelBoard> result=null;
        try {
            result = dao.getBoardList();
        } catch (Exception e) {
            log.error( "getBoardList"+e.getMessage() );
        }
        return result;
	}

	@Override
	public List<ModelBoard> getBoardListResultMap() throws Exception {
		List<ModelBoard> result=null;
        try {
            result = dao.getBoardListResultMap();
        } catch (Exception e) {
            log.error( "getBoardListResultMap"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int insertBoard(ModelBoard board) throws Exception {
		int result= -1;
        try {
            result = dao.insertBoard(board);
        } catch (Exception e) {
            log.error( "insertBoard"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int updateBoard(ModelBoard searchValue, ModelBoard updateValue) throws Exception {
		int result= -1;
        try {
            result = dao.updateBoard(searchValue,updateValue);
        } catch (Exception e) {
            log.error( "updateBoard"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int deleteBoard(ModelBoard board) throws Exception {
		int result= -1;
        try {
            result = dao.deleteBoard(board);
        } catch (Exception e) {
            log.error( "deleteBoard"+e.getMessage() );
        }
        return result;
	}

	@Override
	public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
		List<ModelBoard> result= null;
        try {
            result = dao.getBoardSearch(board);
        } catch (Exception e) {
            log.error( "getBoardSearch"+e.getMessage() );
        }
        return result;
	}

	@Override
	public List<ModelBoard> getBoardPaging(HashMap<String, Object> map) throws Exception {
		List<ModelBoard> result= null;
        try {
            result = dao.getBoardPaging(map);
        } catch (Exception e) {
            log.error( "getBoardPaging"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int insertBoardList(List<ModelBoard> item) throws Exception {
		int result= -1;
        try {
            result = dao.insertBoardList(item);
        } catch (Exception e) {
            log.error( "insertBoardList"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int getArticleTotalRecord(HashMap<String, Object> map) throws Exception {
		int result= -1;
        try {
            result = dao.getArticleTotalRecord(map);
        } catch (Exception e) {
            log.error( "getArticleTotalRecord"+e.getMessage() );
        }
        return result;
	}

	@Override
	public List<ModelArticle> getArticleList(HashMap<String, Object> data) {
		List<ModelArticle> result= null;
        try {
            result = dao.getArticleList(data);
        } catch (Exception e) {
            log.error( "getArticleList"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelArticle getArticle(Integer articleNo) {
		ModelArticle result= null;
        try {
            result = dao.getArticle(articleNo);
        } catch (Exception e) {
            log.error( "getArticle"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int insertArticle(ModelArticle article) {
		int result= -1;
        try {
            result = dao.insertArticle(article);
        } catch (Exception e) {
            log.error( "insertArticle"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int updateArticle(HashMap<String, ModelArticle> data) {
		int result= -1;
        try {
            result = dao.updateArticle(data);
        } catch (Exception e) {
            log.error( "updateArticle"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int deleteArticle(ModelArticle target) {
		int result= -1;
        try {
            result = dao.deleteArticle(target);
        } catch (Exception e) {
            log.error( "deleteArticle"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int increaseHit(int articleNo) {
		int result= -1;
        try {
            result = dao.increaseHit(articleNo);
        } catch (Exception e) {
            log.error( "increaseHit"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelArticle getNextArticle(HashMap<String, Object> articleMap) {
		ModelArticle result= null;
        try {
            result = dao.getNextArticle(articleMap);
        } catch (Exception e) {
            log.error( "getNextArticle"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelArticle getPrevArticle(HashMap<String, Object> articleMap) {
		ModelArticle result= null;
        try {
            result = dao.getPrevArticle(articleMap);
        } catch (Exception e) {
            log.error( "getPrevArticle"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelAttachFile getAttachFile(int attachFileNo) {
		ModelAttachFile result= null;
        try {
            result = dao.getAttachFile(attachFileNo);
        } catch (Exception e) {
            log.error( "getAttachFile"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelAttachFile getAttachFileList(int articleNo) {
		ModelAttachFile result= null;
        try {
            result = dao.getAttachFileList(articleNo);
        } catch (Exception e) {
            log.error( "getAttachFileList"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int insertAttachFile(ModelAttachFile file) {
		int result= -1;
        try {
            result = dao.insertAttachFile(file);
        } catch (Exception e) {
            log.error( "insertAttachFile"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int deleteAttachFile(ModelAttachFile target) {
		int result= -1;
        try {
            result = dao.deleteAttachFile(target);
        } catch (Exception e) {
            log.error( "deleteAttachFile"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelComments getComment(int commentNo) {
		ModelComments result= null;
        try {
            result = dao.getComment(commentNo);
        } catch (Exception e) {
            log.error( "getComment"+e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelComments getCommentList(int articleNo) {
		ModelComments result= null;
        try {
            result = dao.getCommentList(articleNo);
        } catch (Exception e) {
            log.error( "getCommentList"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int insertComment(ModelComments comment) {
		int result= -1;
        try {
            result = dao.insertComment(comment);
        } catch (Exception e) {
            log.error( "insertComment"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int updateComment(HashMap<String, ModelComments> commentMap) {
		int result= -1;
        try {
            result = dao.updateComment(commentMap);
        } catch (Exception e) {
            log.error( "updateComment"+e.getMessage() );
        }
        return result;
	}

	@Override
	public int deleteComment(ModelComments target) {
		int result= -1;
        try {
            result = dao.deleteComment(target);
        } catch (Exception e) {
            log.error( "deleteComment"+e.getMessage() );
        }
        return result;
	}
}
