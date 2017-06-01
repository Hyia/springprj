package java24.board.infc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

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
    
    List<ModelBoard> getBoardPaging(HashMap<String, Object> map) throws Exception;
    
    int insertBoardList(@Param("list") List<ModelBoard> item) throws Exception;
    
    int getArticleTotalRecord(HashMap<String, Object> map) throws Exception;
	
	/** 
	 * mapperBoard.xml 의 line 141 이후에 대한 IBoard작성.
	 * @author Hyia
	 * @since 05/29/2017
	 */	
	
    //<select id="getArticleList" parameterType="hashmap" resultType="ModelArticle">
	/** 게시판 정보. searchWord를 포함시켜주면 검색 가능.
	 * @param data :맵에 들어갈 정보의 이름<br>1.boardcd<br>2.searchWord 검색어<br>3.start 페이지 시작게시글 번호<br>4.end 페이지 마지막 번호를 가짐
	 * @return ModelArticle : 목표 게시목록
	 */
    List<ModelArticle> getArticleList(HashMap<String,Object> data);

	//<select id="getArticle" parameterType="int" resultType="ModelArticle">
	/** 게시글을 가져옴
	 * @param articleNo :게시글 고유번호
	 * @return 게시글
	 */
	ModelArticle getArticle(Integer articleNo);

	//<insert id="insertArticle" parameterType="ModelArticle">
	/** 게시글을 등록함
	 * @param article 게시글
	 * @return 성실여부
	 */
	int insertArticle(ModelArticle article);
 	
    //<update id="updateArticle" parameterType="hashmap">
	/** 게시글을 고침
	 * @param data :HashMap keys<br>searchValue :고칠 게시글<br>updateValue :바꿀 내용
	 * @return 성실여부
	 */
	int updateArticle(HashMap<String,ModelArticle> data);
	
    //<delete id="deleteArticle" parameterType="ModelArticle">
	/** 게시글 삭제
	 * @param target :대상 게시글을 특정할 정보<br>articleNo<br>boardcd<br>email<br>UseYN<br>중 0~4개 선택)
	 * @return 에러코드
	 */
	int deleteArticle(ModelArticle target);
	
    //<update id="increaseHit" parameterType="int">
	/** 게시글의 조회수를 올림
	 * @param articleNo :대상 게시글 번호
	 * @return 성공여부
	 */
	int increaseHit(int articleNo);
	
    //<select id="getNextArticle" parameterType="hashmap" resultType="ModelArticle">
	/** 다음 게시글로 이동
	 * @param articleMap :<br>articleNo (int)<br>boardcd (int)<br>searchWord (String)를 사용
	 * @return 대상 게시글
	 */
	ModelArticle getNextArticle(HashMap<String,Object> articleMap);
	
    //<select id="getPrevArticle" parameterType="hashmap" resultType="ModelArticle">
	/** 이전 게시글로 이동
	 * @param articleMap :articleNo,boardcd, 검색어(searchWord)를 사용
	 * @return 대상 게시글
	 */
	ModelArticle getPrevArticle(HashMap<String,Object> articleMap);
	
    //<select id="getAttachFile" parameterType="int" resultType="ModelAttachFile">
	/** 첨부파일을 가져옴
	 * @param attachFileNo :목표 첨부파일
	 * @return
	 */
	ModelAttachFile getAttachFile(int attachFileNo);
	
    //<select id="getAttachFileList" parameterType="int" resultType="ModelAttachFile">
	/** 대상 게시글의 첨부파일 리스트를 가져옴
	 * @param articleNo :목표 게시글
	 * @return
	 */
	ModelAttachFile getAttachFileList(int articleNo);
	
    //<insert id="insertAttachFile" parameterType="ModelAttachFile">
	/** 파일을 첨부
	 * @param file :넣을 파일
	 * @return
	 */
	int insertAttachFile(ModelAttachFile file);
	
    //<delete id="deleteAttachFile" parameterType="ModelAttachFile">
	/** 삭제함
	 * @param target :(attachfileno, articleno, UseYN)로 특정
	 * @return
	 */
	int deleteAttachFile(ModelAttachFile target);
	
    //<select id="getComment" parameterType="int" resultType="ModelComments">
	/** 목표 댓글을 가져옴
	 * @param commentNo :대상 댓글번호
	 * @return
	 */
	ModelComments getComment(int commentNo);
	
    //<select id="getCommentList" parameterType="int" resultType="ModelComments">
	/** 목표 게시글의 댓글을 가져옴
	 * @param articleNo : 대상 게시글 번호
	 * @return
	 */
	ModelComments getCommentList(int articleNo);
	
    //<insert id="insertComment" parameterType="ModelComments">
	/** 댓글을 담
	 * @param comment :댓글
	 * @return
	 */
	int insertComment(ModelComments comment);
	
    //<update id="updateComment" parameterType="hashmap">
	/** 댓글을 수정함 (updateValue,searchValue 사용)
	 * @param commentMap :두 ModelComments를 맵 안에 넣기(updateValue,searchValue)
	 * @return
	 */
	int updateComment(HashMap<String,ModelComments> commentMap);
	
    //<delete id="deleteComment" parameterType="ModelComments">
	/** 댓삭튀
	 * @param target :지울 댓글
	 * @return
	 */
	int deleteComment(ModelComments target);


}
