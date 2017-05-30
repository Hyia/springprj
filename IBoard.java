package java24.board.infc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java24.board.model.ModelBoard;

public interface IBoard {
    //boardcd => boardnm
    String getBoardName(String boardcd) throws Exception;
    
    //boardcd 해당하는 로우 데이터
    ModelBoard getBoardOne(String boardcd) throws Exception;
    
    //board 테이블 모든 데이터
    List<ModelBoard> getBoardList() throws Exception;
    
    //board 테이블의 ResultMap
    List<ModelBoard> getBoardListResultMap() throws Exception;
    
    
    int insertBoard(ModelBoard board) throws Exception;
    
    int updateBoard(ModelBoard searchValue, ModelBoard updateValue) throws Exception;

    int deleteBoard(ModelBoard board) throws Exception;
    
    
    List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception;
    
    List<ModelBoard> getBoardPaging(ModelBoard board) throws Exception;
    
    int insertBoardList(List<ModelBoard> board) throws Exception;
    
    int getArticleTotalRecord(ModelBoard article) throws Exception;
    
}
