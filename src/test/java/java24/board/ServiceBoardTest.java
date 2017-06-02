package java24.board;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java23.mybatis.infc.IServiceBook;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class ServiceBoardTest {
    private static IServiceBoard service=null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
        	ApplicationContext context=
        			new ClassPathXmlApplicationContext("classpath:java24/board/ApplicationContext.xml");
            service = context.getBean("serviceboard",IServiceBoard.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testGetBoardName() {
        String board = "data";
        String result = null;
        try {
            result = service.getBoardName(board);
        } catch (Exception e) {
        }
        assertEquals(result,"자료실");
    }
    
    @Test
    public void testGetBoardOne() {
        ModelBoard result = null;
        try {
            result = service.getBoardOne("free");
        } catch (Exception e) {
        }
        assertNotNull(result);
        
    }
    
    @Test
    public void testGetBoardList() {
        List<ModelBoard> result = new ArrayList<ModelBoard>();
        try {
            result = service.getBoardList();
        } catch (Exception e) {
        }
        assertSame(result.size(),3);
    }
    
    @Test
    public void testGetBoardListResultMap() {
        List<ModelBoard> result = new ArrayList<ModelBoard>();
        try {
            result = service.getBoardListResultMap();
        } catch (Exception e) {
        }
        
        assertNotEquals(result.size(),0);
    }
    
    @Test
    public void testInsertBoard() {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test");
        board.setBoardcd("test");
        board.setUseYN(true);
        int result = -1;
        try {
            result = service.insertBoard(board);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateBoard() {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test");
        board.setBoardcd("test");
        board.setUseYN(true);
        ModelBoard nboard = new ModelBoard();
        nboard.setBoardnm("update");
        nboard.setBoardcd("update");
        nboard.setUseYN(false);
        int result = -1;
        try {
            result = service.updateBoard(board, nboard);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteBoard() {
        ModelBoard nboard = new ModelBoard();
        nboard.setBoardnm("update");
        nboard.setBoardcd("update");
        nboard.setUseYN(false);
        int result = -1;
        try {
            service.insertBoard(nboard);
        } catch (Exception e) {
        }
        try {
            result = service.deleteBoard(nboard);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testGetBoardSearch() {
        List<ModelBoard> result = null;
        ModelBoard board = new ModelBoard();
        board.setBoardnm("자료실");
        try {
            result = service.getBoardSearch(board);
        } catch (Exception e) {
        }
        
    }
    
    @Test
    public void testGetBoardPaging() {
        List<ModelBoard> result = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchWord","자료실");
        map.put("boardcd","data");
        map.put("start",0);
        map.put("end",99);
        try {
            result = service.getBoardPaging(map);
        } catch (Exception e) {
       
   
        }
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertBoardList() {
        List<ModelBoard> boardlist = new ArrayList<ModelBoard>();
        ModelBoard board = new ModelBoard();
        board.setBoardnm("test1");
        board.setBoardcd("test1");
        board.setUseYN(true);
        ModelBoard board1 = new ModelBoard();
        board1.setBoardnm("test2");
        board1.setBoardcd("test2");
        board1.setUseYN(true);
        
        boardlist.add(board);
        boardlist.add(board1);

        int result = -1;
        try {
            result = service.insertBoardList(boardlist);
        } catch (Exception e) {
        }
        assertSame(result, 2);
    }
    
    @Test
    public void testGetArticleTotalRecord() {
        int result = -1;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchWord","test");
        map.put("boardcd","free");
        map.put("start",0);
        map.put("end",99);
        try {
            result = service.getArticleTotalRecord(map);
        } catch (Exception e) {}
        assertSame(result, 14);
    }
    
    @Test
    public void testGetArticleList() {
        List<ModelArticle> result =null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchWord","test");
        try {
            result = service.getArticleList(map);
        } catch (Exception e) {}
        assertSame(result.size(),0);
        
    }
    
    @Test
    public void testGetArticle() {
        ModelArticle result =null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("searchWord","test");
        try {
            result = service.getArticle(10);
        } catch (Exception e) {}
        assertNotNull(result);
    }
    
    @Test
    public void testInsertArticle() {
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setTitle("test");
        article.setUseYN(true);
        article.setContent("test");
        article.setEmail("test@test.test");
        article.setArticleno(99);
        int result = -1;
        try {
            result = service.insertArticle(article);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateArticle() {
        int result = -1;
        ModelArticle article= new ModelArticle();
        article.setTitle("test");
        article.setBoardcd("free");
        article.setUseYN(true);
        ModelArticle article1= new ModelArticle();
        article1.setTitle("Update");
        article1.setUseYN(false);
        try {
            result = service.updateArticle(article,article1);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteArticle() {
        int result = -1;
        ModelArticle article= new ModelArticle();
        article.setTitle("Update");
        article.setBoardcd("free");
        article.setUseYN(false);
        try {
            result = service.deleteArticle(article);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testIncreaseHit() {
        int result = -1;
        try {
            result = service.increaseHit(24);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testGetNextArticle() {
        ModelArticle result = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("articleno", 1);
        map.put("boardcd","free");
        map.put("searchWord","");
        try {
            result = service.getNextArticle(map);
        } catch (Exception e) {
        }
        
    }
    
    @Test
    public void testGetPrevArticle() {
        ModelArticle result = null;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("articleno", 2);
        map.put("boardcd","free");
        try {
            result = service.getPrevArticle(map);
        } catch (Exception e) {
        }
    
    }
    
    @Test
    public void testGetAttachFile() {
        ModelAttachFile result = null;
        try {
            result = service.getAttachFile(1);
        } catch (Exception e) {
        }
        assertNotNull(result);
    }
    
    @Test
    public void testGetAttachFileList() {
        ModelAttachFile result = new ModelAttachFile();
        try {
            result = service.getAttachFileList(1);
        } catch (Exception e) {
        }
        assertNotNull(result);
    }
    
    @Test
    public void testInsertAttachFile() {
        ModelAttachFile att = new ModelAttachFile();
        att.setFilename("test");
        int result = -1;
        try {
            result = service.insertAttachFile(att);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteAttachFile() {
        ModelAttachFile att = new ModelAttachFile();
        att.setFilename("test");
        att.setAttachfileno(12);
        int result = -1;
        try {
            result = service.deleteAttachFile(att);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testGetComment() {
        ModelComments result = null;
        try {
            result = service.getComment(1);
        } catch (Exception e) {
        }
        assertNotNull(result);
    }
    
    @Test
    public void testGetCommentList() {
        ModelComments result = null;
        try {
            result = service.getComment(1);
        } catch (Exception e) {
        }
        assertNotNull(result);
    }
    
    @Test
    public void testInsertComment() {
        ModelComments comm = new ModelComments();
        comm.setArticleno(8);
        int result = -1;
        try {
            result = service.insertComment(comm);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateComment() {
        int result = -1;
        ModelComments comm= new ModelComments();
        comm.setArticleno(8);
        ModelComments comm1= new ModelComments();
        comm.setEmail("test@test.test");
        try {
            result = service.updateComment(comm,comm1);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteComment() {
        ModelComments comm = new ModelComments();
        comm.setArticleno(8);
        int result = -1;
        try {
            result = service.deleteComment(comm);
        } catch (Exception e) {
        }
        assertSame(result, 1);
    }
    
}
